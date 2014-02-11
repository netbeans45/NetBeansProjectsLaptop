/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        
        System.out.println("what is: " + num1 + " + " + num2 + " = ");
        
        Scanner input = new Scanner(System.in);
        
        int answer = num1 + num2;
        
        int useranswer = input.nextInt();
        
        if(useranswer == answer)
            System.out.println("Correct!");
        else
            System.out.println("NOPE! Chuck Testa!");
    }
}
