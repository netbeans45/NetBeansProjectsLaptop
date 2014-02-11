/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

import java.util.Scanner;
import Chapter_1.Counter;

public class UserInput2 {
        private static int[] nums = new int[1000];
       // private static int cnt = 0; // the number of numbers that have been entered
        private static Counter cnt = new Counter(); // the number of numbers that have been entered
        
    
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        while(true){
            displayChoices();
            int choice = getChoice(stdin);
            if(choice == 1){
                getNumber(stdin);
            }else if(choice==2){
                calculateTotal();
            }else if (choice==3){
                calculateAverage();
            }else if (choice==4){
                calculateMedian();
            }else if (choice==5){
                break;
            }
        }
        System.out.println("Good-bye!");
    }// end of the main method

    private static void displayChoices() {
        System.out.println("1. Enter a number");
        System.out.println("2. Calculate total");
        System.out.println("3. Calculate average");
        System.out.println("4. Calculate median");
        System.out.println("5. Exit");
    }

    private static int getChoice(Scanner stdin) {
        System.out.println("Choice? ");
        return stdin.nextInt();
    }

    private static void getNumber(Scanner stdin) {
        //0. Get a number from the keyeboard
        System.out.println("Please enter a number:");
        
        //1. Store the number in the array
        //2. Store the number in the array
        //3. Increment the count
      //  nums[cnt++] = stdin.nextInt();
        nums[cnt.getCount()] = stdin.nextInt();
        cnt.incrementCount();
    }

    private static int getTotal(){
            int total = 0;
        for (int i = 0; i < cnt.getCount(); i++) {
            int j = nums[i];
            total += j;
    }
        return total;
  }
    
    private static void calculateTotal() {
        System.out.println("The total is: " + getTotal());
        }
        
    

    private static void calculateAverage() {
    //int total = getTotal();
    System.out.println("The average is: " + getTotal()/(double)cnt.getCount());
    }

    private static void calculateMedian() {
       // int[] sortednums
            int[] sortedNums = java.util.Arrays.copyOfRange(nums, 0, cnt.getCount());
        java.util.Arrays.sort(sortedNums);
        if(cnt.getCount()%2 == 1){
        //odd number of numbers
        int m = cnt.getCount()/2;
        int n = m-1;
            System.out.println("The median is: " + (sortedNums[n])/2.0);
        }
    }
}
