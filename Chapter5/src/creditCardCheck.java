import java.util.*;
public class creditCardCheck {
    public static void main(String[] args) {
        long cardNumber = 4388576018402626l;
       
        int length = getSize(cardNumber);
      
        for (int i = 1; i <= length; i++){
            if (length % 2 == 0){
           
               getSize(cardNumber);
           
            }
           
       
        }
getPrefix(cardNumber, 2);
       
       
    } // end of the main method
    public static boolean isValid(long number){
        return true;
   
    } // end of isValid method
    public static int sumOfDoubleEvenPlace(long number){
        int result; 
        //for (int 1 = number.length() - 2; i > = 0; 1 -=2){
        return 0;
        result = result + getDigit(Integer.parseInt(number.charAt(i) * 2));
    }
        
        
        //for(int i=1;i<getSize(number);i+=2 ){
        //long x = number / 10;
        //long x1 = number / 100;
        
        
        //if (getSize(number) == 16){
        
    //    }
        
       
    } // end of the sumOfDoubleEvenPlace
    public static int getDigit(int number){
        if (number < 10)
            return number;
        else
            return (number/10) + (number%10);
   
    } // end of getDigit
    public static int sumOfOddPlace(long number){
        return 0;
   
    } // end of sumOfOddPlace
    public static boolean prefixMatched(long number, int d){
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
        String num = Long.toString(number);
        int index0 = -1;
        if (k > number)
            return number;
        else{
            for(int i = 0; i < k; i++){
            index0 = num.charAt(i);
             //  System.out.println(index0);
            //int index1 =
              //  System.out.println(index0);
           
            }
            return index0;
        }
    } // end of getPrefix
}