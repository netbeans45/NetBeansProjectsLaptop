/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


public class IncDecDemo {
    public static void main(String[] args) {
        int num1 = 25;
        
        System.out.println("num1 is : " + num1);
        
        num1 = num1 + 1;
        
        System.out.println("num1 is : " + num1);
        
        num1++;
        
        System.out.println("num1 is : " + num1);
        
        ++num1;
        
        System.out.println("num1 is 28: " + num1);
        
         /* --num1;
        
         System.out.println("num1 is : " + num1); */
         
         System.out.println("num1 is : " + (num1 + 1));
         System.out.println("num1 is ++num1: " + ++num1);
         System.out.println("num1 is : " + num1++);
         System.out.println("num1 is : " + num1);
         
         num1 *= 10;
         
         System.out.println("num1 is : " + num1);
         
         num1 += 20;
         System.out.println("num1 is : " + num1);
         
         double bigNum = 78.99;
         
         double otherNum = bigNum;
         
         int sumNum = (int)bigNum;
         
       
         System.out.println(sumNum);
         
         double x = 35 + bigNum;
         
         System.out.println("x is: " + x);
         
         int y = 10;
         
         x = bigNum / y;
         
         System.out.println("X is: " + x);
         
        // int z = bigNum / y;
         
        // System.out.println("z is: " + );
         
         
         
        
        
        
    } // END OF THE MAIN METHOD
}
