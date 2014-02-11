
import javax.swing.JOptionPane;

// Tyler Coatsworth 11/3/2013

public class MyTriangle {
    public static void main(String[] args) {
        String sd1 = JOptionPane.showInputDialog("Enter in the first side: ");
            double side1 = Double.parseDouble(sd1);
        
        String sd2 = JOptionPane.showInputDialog("Enter in the second side: ");
            double side2 = Double.parseDouble(sd2);
        
        String sd3 = JOptionPane.showInputDialog("Enter in the third side: ");
            double side3 = Double.parseDouble(sd3);
        
            if (isValid(side1, side2, side3) == true)
                JOptionPane.showMessageDialog(null, "This is a valid triangle, and it has an area of: " + area(side1, side2, side3));
            else
                JOptionPane.showMessageDialog(null, "This is NOT a valid triangle");
          
            
    } // end of the main method
    public static boolean isValid(double a, double b, double c){
            //Math:
        if( a + b > c && a + c > b && b + c > a)
            return true;
        else
            return false;
    
    } // end of isValid
    public static double area(double a, double b, double c){
        double p = ((a+b+c)/2);
        
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        return area;
   
    } // end of area
}
