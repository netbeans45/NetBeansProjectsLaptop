//import java.util.Scanner;

public class WithSout {
    public static void main(String[] args) {
   
        long cardNumber = 4388576018410707l;
//        long cardNumber = 4388576018402626l;
        long number = cardNumber;
       
       
        boolean ValidCard = isValid(cardNumber);
        System.out.println("ValidCard = " + ValidCard);
     } // end of the main method
   
    public static boolean isValid(long number){
        int SumOfEven = sumOfDoubleEvenPlace(number);
        System.out.println("SumEven=" + SumOfEven);
        int SumOfOdd = sumOfOddPlace(number);
        System.out.println("SumOdd=" + SumOfOdd);
        int SumOfEvenAndOdd = SumOfEven + SumOfOdd;
        System.out.println("Sumofevenandodd = " + SumOfEvenAndOdd);
        if((SumOfEvenAndOdd % 10) != 0)//all the false kick out
            return false;
       
        int ValidSize = getSize(number);
        if(ValidSize < 13 || ValidSize > 16)
            return false;
       
        long prefix = 0;
        int prefixSize = 0;
        long cardNumber = 0;
       
        while(cardNumber > 0){//gets us to the leftmost digit
            prefix = cardNumber % 10;
            cardNumber = cardNumber / 10;
        }// end of while loop
        if(prefix == 3)//if prefix is equal to 3, then we know that the size must be 2 (because 37)
            prefixSize = 2;
        else
            prefixSize = 1;
        System.out.println("prefixSize = " + prefixSize);
        prefix = getPrefix(number, prefixSize);
        System.out.println("prefix = " + prefix);
        boolean prefixValid = prefixMatched(cardNumber, prefix);
        if(prefixValid == false)
            return false;
       
        return true;
    } // end of isValid method
   
     public static int sumOfDoubleEvenPlace(long number){
         System.out.println("number =" + number);
         int SumNumber = 0;
         long EvenNumber = 0;
         int NewNumber = 0;
        
         number = number / 10; //for the initial starting position
         while(number > 0){//keeps looping until all numbers are used
             System.out.println("Number = " + number);
         EvenNumber = number % 10; //grabbing the rightmost single position
         EvenNumber *= 2;//doubling the single digit
             System.out.println("EvenNumber = " + EvenNumber);
         NewNumber = getDigit((int) EvenNumber);//NewNumber will either contain sum of two digits or the single value; sending the single position to getDigit
         SumNumber = SumNumber + NewNumber;
             System.out.println("SumNumber =" + SumNumber);
         number = number / 100; //dividing by 100 to get to the second position
         }
        return SumNumber;
      
    } // end of the sumOfDoubleEvenPlace
    
    public static int getDigit(int resultingNumber){
         String resultingNumberStr = Long.toString(resultingNumber);
         int length = resultingNumberStr.length();//gets the number of characters in the string;
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
             System.out.println("Number = " + number);
         OddNumber = number % 10; //grabbing the rightmost single position
             System.out.println("OddNumber = " + OddNumber);
         NewNumber = getDigit((int) OddNumber);//NewNumber will either contain sum of two digits or the single value; sending the single position to getDigit
         SumNumber = SumNumber + NewNumber;
             System.out.println("SumNumber =" + SumNumber);
         number = number / 100; //dividing by 100 to skip a position
         }
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
        System.out.println("size = " + size);
    return size;
    }// end of getSize
   
    public static long getPrefix(long number, int k){
        int size = getSize(number);
        if(size < k)
            return number;
       
        int position = size;
        long prefix = 0;
        long cardNumber = number;
        while(cardNumber > 0){//gets us to the leftmost digit
            if (k == 2)
                if (position == 2)
                   prefix = cardNumber % 10;
                else
                if (position == 1)
                   prefix = prefix * 10 + cardNumber % 10;
            if (k == 1 && position == 1)
                prefix = cardNumber % 10; 
            cardNumber = cardNumber / 10;
            position = position - 1;
        }// end of while loop
       
        return prefix;
            }//end of getPrefix
   
    } // end of class