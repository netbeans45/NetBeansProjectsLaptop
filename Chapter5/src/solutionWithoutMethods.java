
import java.util.Scanner;


public class solutionWithoutMethods {
    
 public static void main(String[] args) {

 Scanner inScanner = new Scanner(System.in);
 System.out.println("Enter the Card Number ");
 String number = inScanner.next();
 int cardNumber[] = new int[number.length()];
 
 for(int i =0; i <number.length(); i++ ) {
 cardNumber[i] = Integer.parseInt("" + number.charAt(i));
 }
 System.out.println("the card number " + number + " is valid: " + validate(cardNumber));

 }
 public static boolean validate(int[] number) {
 boolean valid = false;
 int sum1 = 0;
 int sum2 = 0;
 int sum = 0;
 for(int i= number.length-2,j = number.length -1 ; i >= 0; i=i-2,j=j-2){


 int t = number[i] * 2;
 if(t > 9) {
 int r1 = t % 10;
 t = t /10;
 int r2 = t % 10;
 t= r1 + r2;
 }
 sum1 += t;
 sum2 += number[j];
 }
 sum = sum1 + sum2;
 if(sum % 10 == 0)
 valid = true;
 else
 valid = false;
 return valid;
 }

 }

