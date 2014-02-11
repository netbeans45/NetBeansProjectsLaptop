/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author home
 */
public class MultiSelectionDemo {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 30;
        int num3 = 20;
        
        if(num1 < num2 && num2 < num3)
        
        System.out.println("num1 is less than num2 and num2 is less than num3");
        
        if(num1 < num2 || num2 < num3)
            System.out.println("num1 is less than num2 OR num2 is less than num3");
        
        int y = (num1 < num3)? 70 : 75;
        
        System.out.println("Y is: " + y);
        
    } // end of the main mehtod
}
