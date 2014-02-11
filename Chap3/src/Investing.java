
import java.util.Scanner;

// Author: @ Tyler Coatsworth (9/26/2013)
public class Investing {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double investmentAmount;
        double annualInterestRate;
        int numberOfYears;
        double futureInvestmentValue;
        int yearsTimesTwelve;
        double answerPrintMe;
        
        System.out.println("Enter in the Investment Amount: ");
        investmentAmount = in.nextDouble();
        
        System.out.println("Enter in the annual interest rate: ");
        annualInterestRate = in.nextDouble();
        
        System.out.println("Enter in number of years to calculate for: ");
        numberOfYears = in.nextInt();
        
         double annualInterestRate2 = annualInterestRate / 100;
        // numberOfYears * 12
        
          double monthlyInterestRate = annualInterestRate2 / 12;   
          
         futureInvestmentValue = (1 + monthlyInterestRate);
        yearsTimesTwelve = numberOfYears * 12;
        
        double almost = Math.pow(futureInvestmentValue,yearsTimesTwelve);
         
         answerPrintMe = almost * investmentAmount;
         
         
         
        // public static double pow(double a, double b);
       
        
        
       // double c = Math.pow(a,b);
       // return almost;
        // System.out.println("Accumulated value is :   $" + almost);
        System.out.println("Accumulated value is :   $" + answerPrintMe);
       
        
        /*
        System.out.println("__________________________________");
        System.out.println("investmentAmount = " + investmentAmount);
        System.out.println("annualInterestRate = " + annualInterestRate2);
        System.out.println("numberOfYears = " + numberOfYears);
        System.out.println("futureInvestmentValue = " + futureInvestmentValue);
        System.out.println("monthlyInterestRate = " + monthlyInterestRate);
        System.out.println("annual interest: " + annualInterestRate);
        System.out.println("annual interest 2: " + annualInterestRate2);
        
        */
        
    } // end of the main method
}
