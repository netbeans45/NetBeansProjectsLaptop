
import java.util.Scanner;

// Author: Tyler Coatsworth 10/7/2013
public class AndOrXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter in an integer: ");
            int userInput = input.nextInt();
        
            int divBy5 = userInput % 5;
            int divBy6 = userInput % 6;
       //-------------------------------------------------------------------------------------        
        boolean isDivByAND;
        boolean isDivByOR;
        boolean isDivByXOR;
        //=====================================================================================
        if ( divBy5 == 0 && divBy6 == 0) {
            isDivByAND = true;
            System.out.println("Is "+ userInput + " divisible by 5 and 6?   " + isDivByAND);
        }
        else {
            isDivByAND = false;
            System.out.println("Is "+ userInput + " divisible by 5 and 6?   " + isDivByAND);
        } 
        //======================================================================================
        if (divBy5 == 0 || divBy6 ==0){
            isDivByOR = true;
            System.out.println("Is "+ userInput + " divisible by 5 or 6?   " + isDivByOR);
        }
        else {
        isDivByOR = false;
        System.out.println("Is "+ userInput + " divisible by 5 or 6?   " + isDivByOR);
        }
        //=====================================================================================
        if (divBy5 == 0 ^ divBy6 ==0){
            isDivByXOR = true;
            System.out.println("Is "+ userInput + " divisible by 5 or 6, but not both?   " + isDivByXOR);
        }
        else {
        isDivByXOR = false;
        System.out.println("Is "+ userInput + " divisible by 5 or 6, but not both?   " + isDivByXOR);
        }
        
    } // end of the main method
}
