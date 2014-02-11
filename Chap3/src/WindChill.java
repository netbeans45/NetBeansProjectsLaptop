
import javax.swing.JOptionPane;

// Author: Tyler Coatsworth 10/6/2013
public class WindChill {
    public static void main(String[] args) {
        
        double ta; // temperature measued in degrees Fahrenheit
        double v; // speed measured in mph
        double twc; // the wind-chill temperature
        
        String taStr = JOptionPane.showInputDialog("Enter in the outside temperature (in degrees Fahrenheit)");
            ta = Double.parseDouble (taStr);
        String vStr = JOptionPane.showInputDialog("Enter in wind speed (in mph)");
            v = Double.parseDouble(vStr);
                
        twc = (double) (35.74 + 0.6215 * (ta) - 35.75 * Math.pow(v,0.16) + 0.4275 * (ta) * Math.pow(v,0.16));
        
        if (ta >= -58 && ta <= 41 && v >= 2){
        JOptionPane.showMessageDialog(null, "The wind chill index is: " + twc);
        }
        else if (ta >= -58 && ta <= 41 && !(v >= 2)){
            JOptionPane.showMessageDialog(null, "Please enter in a correct wind speed (greater than or equal to 2 mph)");
        }
        else if(!(ta >= -58 && ta <= 41) && (v >= 2)) {
            JOptionPane.showMessageDialog(null, "Please enter in a correct temperature (between -58 and 41)");
          }
        else /* if (!(ta >= -58 && ta <= 41) && !(v >= 2)) */{
            JOptionPane.showMessageDialog(null, "Please enter in a correct temperature (between -58 and 41) and correct wind speed (greater than or equal to 2 mph)");
        }
        
    } // end of the main method
}
