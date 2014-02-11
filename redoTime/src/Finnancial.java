
import java.util.Scanner;

// Tyler Coatsworth 10/18/2013
public class Finnancial /* <-- glad I can spell... */{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double annualInterestRate = 5;
        for (double i = annualInterestRate; i <= 8; i+=.125){
       // System.out.println("Enter annual interest rate, ex. 7.25%: ");
            
            double monthlyInterestRate = annualInterestRate / 1200;
            
        System.out.println("Enter loan amount, ex. 120000.95: ");
            double loanAmount = input.nextDouble();
            
        System.out.println("Enter number of years as an integer, ex. 5: ");
            int numberOfYears = input.nextInt();
        

            double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            double totalPayment = monthlyPayment * numberOfYears * 12;

        
        
        System.out.printf("%10s     %10s     %10s\n","Interest Rate", "Monthly Payment", "Total Payment\n");
 
        
                double two = (monthlyPayment * 100) / 100.0;
                double three = (totalPayment * 100)/100.0;
               // double one = 5 + (i * .125);
            System.out.printf("%5.3f             %5.2f              %5.2f\n",i, two,three);
           // System.out.println(annualInterestRate);
            //annualInterestRate+= .125; // HOW DOES ONE EFFECT THE VARIABLE IN A WAY THAT OTHER VARIABLES THAT ARE EFFECTED BY IT GET UPDATED TOO??
            
        
        }
      //  System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
      //  System.out.println("The total payment is $" + (int) (totalPayment * 100)/100.0);
        
            
    } // end of the main method
}
