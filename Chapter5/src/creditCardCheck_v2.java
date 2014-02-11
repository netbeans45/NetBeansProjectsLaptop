import java.util.*;
public class creditCardCheck_v2 {
    public static void main(String[] args) {
        long cardNumber = 4388576018402626l;
        int length = getSize(cardNumber);
        long prefix = getPrefix(cardNumber, 2);
        boolean prefixValid = prefixMatched(cardNumber, prefix);
        
        isValid(cardNumber,prefixValid);
      
        sumOfDoubleEvenPlace(cardNumber);
        
       /* for (int i = 1; i <= length; i++){
            if (length % 2 == 0){
             
                
            }
           
       
        }*/


 



        System.out.println(prefixMatched(cardNumber, prefix));
    } // end of the main method
    public static boolean isValid(long number, boolean prefix){
        if (prefix == true)
        return true;
   else
            return false;
    } // end of isValid method
    public static int sumOfDoubleEvenPlace(long number){
        //long divideBy = 1000000000000000l;
        for(int i = getSize(number); number > 0; number=number/100) {
           int newNumber = getDigit((int) number);
            int newNumber1 = newNumber* 2;
            
            if (newNumber1 < 10)
                System.out.println(newNumber1);
            //return newNumber1;
        else
                System.out.println((newNumber1/10) + (newNumber1%10));
           // return (newNumber1/10) + (newNumber1%10);
            
        }
        
        return 0;
       
    } // end of the sumOfDoubleEvenPlace
    public static int getDigit(int number){
        number = number % 10;
        return number;
   
    } // end of getDigit
    public static int sumOfOddPlace(long number){
        return 0;
   
    } // end of sumOfOddPlace
    public static boolean prefixMatched(long number, long d){  
        if (d == 37 || d >= 40 && d <= 69)
            return true;
        else
            return false;
   
    } // end of prefixMatched
    public static int getSize (long g){
        String cardNumberStr = Long.toString(g);
        int length = cardNumberStr.length();
        return length;
   
    }// end of getSize
    public static long getPrefix(long number, int k){
        long firstTwoDigits;
        if (k > number)
            return number; // checks to see if k is greater than card, if not return card number
        else if (getSize(number) == 16){
             firstTwoDigits = number / 100000000000000l;
        
        }
        else if (getSize(number) == 15){
             firstTwoDigits = number / 10000000000000l;
        
        }   
        else if (getSize(number) == 14){
             firstTwoDigits = number / 1000000000000l;
        
        }
        else if (getSize(number) == 13){
             firstTwoDigits = number / 100000000000l;
        
        }
            else
                return 0;
        
               return firstTwoDigits;
        }
    } // end of getPrefix



/*String num = Long.toString(number);
        int index0 = -1;
        if (k > number)
            return number;
        else{
            for(int i = 0; i < k; i++){
            index0 = num.charAt(i);
             //  System.out.println(index0);
            //int index1 =
              //  System.out.println(index0);
           
            }*/