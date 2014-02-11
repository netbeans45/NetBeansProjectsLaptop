
import java.util.Scanner;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
public class CMDInputOutput2 {
    public static void main(String[] args) {
       /* String word = "yeah";
        System.out.println(word); */
        
        Scanner in = new Scanner(System.in);
        
        int num1;
        double num2;
        double sum;
        
        System.out.print("Enter an Integer: ");
        num1 = in.nextInt();
        
        
        System.out.print("Enter a second Integer: ");
        num2 = in.nextDouble();
        
        System.out.println("num1 is: " + num1);
        System.out.println("num2 is: " + num2);
        
        sum = num1 + num2;
        
        System.out.println("Sum of num1 and num2: " + sum);
        
        
    }
}
