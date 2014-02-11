
import javax.swing.JOptionPane;

// Author: @ Tyler Coatsworth 9/25/2013

public class SixMonthsProg {
    public static void main(String[] args) {
        
        String depositAmount = JOptionPane.showInputDialog("How much money do you wish to deposit each month?");
        
        String interestRate = JOptionPane.showInputDialog("Desired annual interest rate (0.05 = 5%)?");
        
        double depositAmountNumber = Double.parseDouble(depositAmount);
        
        double interestRateNumber = Double.parseDouble(interestRate);
        
        double monthlyInterestRate = interestRateNumber / 12;
        
        double monthUno = depositAmountNumber * (1 + monthlyInterestRate);
        
        double monthDos =  (depositAmountNumber + monthUno) * (1 + monthlyInterestRate);
        
        double monthTres =  (depositAmountNumber + monthDos) * (1 + monthlyInterestRate);
        
        double monthQuatro =  (depositAmountNumber + monthTres) * (1 + monthlyInterestRate);
        
        double monthCinco =  (depositAmountNumber + monthQuatro) * (1 + monthlyInterestRate);
        
        double monthSeis =  (depositAmountNumber + monthCinco) * (1 + monthlyInterestRate);
        
        
        JOptionPane.showMessageDialog(null, "The value of your account after 6 months is:   " + monthSeis);
       
      //  System.out.println("despositAmountNumber is: "+ depositAmountNumber);
       // System.out.println("monthlyINterestRate is: " + monthlyInterestRate);
        
        
        
    } // end of main method
    
}
