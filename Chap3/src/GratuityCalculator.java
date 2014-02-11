
import javax.swing.JOptionPane;

// Author: @ Tyler Coatsworth (9/23/2013)
public class GratuityCalculator {

    public static void main(String[] args) {

        String checkAmount = JOptionPane.showInputDialog("Enter Check Amount (ex. 10.25)");

        double numCheckAmount = Double.parseDouble(checkAmount);

        String gratuityRate = JOptionPane.showInputDialog("Enter Gratuity Amount (ex. 0.15)");
        
        double numGratuityRate = Double.parseDouble(gratuityRate);
        
        double displayedGratuityRate = numGratuityRate * 100;
        
        double checkTotal = numCheckAmount * (1 + numGratuityRate);
        
         //  (double)Math.round(checkTotal * 100) / 100;
          //  double roundedTotal = Math.round(checkTotal * 10000) / 10000;
                
        
        JOptionPane.showMessageDialog(null, "Check Amount: " + "$" + numCheckAmount + "       Gratuity Rate: " + displayedGratuityRate + "%" +  "        Check Total: " + "$" + checkTotal);
                
        
        








    } // end of the main method
}
