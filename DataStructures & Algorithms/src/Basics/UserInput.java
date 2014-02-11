package Basics;

import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = stdin.nextInt();
        System.out.println("Please enter a number: ");
        int num2 = stdin.nextInt();      
        if(num1 > num2){
            System.out.println("the larger number is: "+ num1);}
        if(num1 < num2){
            System.out.println("the larger number is: "+ num2);
        } 
       if (num1 == num2)
                System.out.println("They are both equal to: " + num1);
       
       for(int i=num1;i<=num2;i++){
           System.out.println(i);
       }
       
    }// end of thee main method
}
