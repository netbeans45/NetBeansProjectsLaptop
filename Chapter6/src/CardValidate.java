import javax.swing.JOptionPane;


//import java.util.Scanner;

public class CardValidate {
    public static void main(String[] args) {
   
//      long cardNumber = 4388576018410707l;//good number
//      long cardNumber = 4388576018402626l;//bad number
        String input = JOptionPane.showInputDialog("Please enter the credit card number: ");
        long cardNumber = Long.parseLong(input);
       
        boolean ValidCard = isValid(cardNumber);
        if(ValidCard == true)
             JOptionPane.showMessageDialog(null, "The credit card is valid.");
     } // end of the main method
   
    public static boolean isValid(long number){
        int ValidSize = getSize(number);
        if(ValidSize < 13 || ValidSize > 16){
            JOptionPane.showMessageDialog(null, "The credit card number size is less than 13 or greater than 16 digits.\nTherefore the credit card is invalid. ");
            return false;
        }//end of if statement
       
        long prefix = 0;
        int prefixSize;
        long cardNumber = number;
        while(cardNumber > 0){//gets us to the leftmost digit
            prefix = cardNumber % 10;
            cardNumber = cardNumber / 10;
        }// end of while loop
        if(prefix == 3)//if prefix is equal to 3, then we know that the size must be 2 (because 37)
            prefixSize = 2;
        else
            prefixSize = 1;
        prefix = getPrefix(number, prefixSize);
        boolean prefixValid = prefixMatched(cardNumber, prefix);
        if(prefixValid == false){
            JOptionPane.showMessageDialog(null, "The prefix of the credit card is invalid and must be 37, 4, 5, or 6.\nTherefore the credit card is invalid. ");
            return false;
        }//end of if statement
       
        int SumOfEven = sumOfDoubleEvenPlace(number);
        int SumOfOdd = sumOfOddPlace(number);
        int SumOfEvenAndOdd = SumOfEven + SumOfOdd;
        if((SumOfEvenAndOdd % 10) != 0){//all the false kick out
            JOptionPane.showMessageDialog(null, "The credit card number composition is not evenly divisible by 10.\nTherefore the credit card is invalid. ");
            return false;
        }//end of if statement
       
        return true;
    } // end of isValid method
   
     public static int sumOfDoubleEvenPlace(long number){
         int SumNumber = 0;
         long EvenNumber = 0;
         int NewNumber = 0;
         number = number / 10; //for the initial starting position
         while(number > 0){//keeps looping until all numbers are used
            EvenNumber = number % 10; //grabbing the rightmost single position
            EvenNumber *= 2;//doubling the single digit
            NewNumber = getDigit((int) EvenNumber);//NewNumber will either contain sum of two digits or the single value; sending the single position to getDigit
            SumNumber = SumNumber + NewNumber;
            number = number / 100; //dividing by 100 to get to the second position
         }//end of while loop
        
        return SumNumber;
    } // end of the sumOfDoubleEvenPlace
    
    public static int getDigit(int resultingNumber){
         int length = getSize(resultingNumber);
         if(length == 1)
             return resultingNumber;
        
         int sumOfNumber = 0;
         sumOfNumber = sumOfNumber + (resultingNumber % 10);
         resultingNumber = resultingNumber / 10;
         sumOfNumber = sumOfNumber + resultingNumber;
       
        return sumOfNumber;
    } // end of getDigit
   
    public static int sumOfOddPlace(long number){
       
         int SumNumber = 0;
         long OddNumber = 0;
         int NewNumber = 0;
         while(number > 0){//keeps looping until all numbers are used
            OddNumber = number % 10; //grabbing the rightmost single position
            NewNumber = getDigit((int) OddNumber);//NewNumber will either contain sum of two digits or the single value; sending the single position to getDigit
            SumNumber = SumNumber + NewNumber;
            number = number / 100; //dividing by 100 to skip a position
         }//end of while loop
        
        return SumNumber;
    } // end of sumOfOddPlace
   
    public static boolean prefixMatched(long number, long d){ 
         if (d == 37 || d == 4 || d == 5 || d == 6)
            return true;
        else
            return false;
  
    } // end of prefixMatched
   
    public static int getSize (long d){
       int size = 0;
       while(d > 0){//gets us the size of the card
            size = size + 1;//the length
            d = d / 10;
       }// end of while loop
      
    return size;
    }// end of getSize
   
    public static long getPrefix(long number, int k){
        int size = getSize(number);
        if(size < k)//error trapping
            return number;
       
        int position = size;
        long prefix = 0;
        long cardNumber = number;
        while(cardNumber > 0){//gets us to the leftmost digit
            if (k == 2)//trapping out 37 as opposed to 4, 5, or 6
                if (position == 2)
                   prefix = cardNumber % 10;//saving the 7
                else
                if (position == 1)
                   prefix = (cardNumber % 10) * 10 + prefix;//putting 3 in front of 7
            if (k == 1 && position == 1)
                prefix = cardNumber % 10;  //gives one digit at a time
            
            cardNumber = cardNumber / 10;//carves off one digit at a time
            position = position - 1;
        }// end of while loop
       
        return prefix;
            }//end of getPrefix
   
    } // end of class