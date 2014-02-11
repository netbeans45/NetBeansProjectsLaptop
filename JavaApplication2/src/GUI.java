
import javax.swing.JOptionPane;


public class GUI {
    public static void main(String[] args) {
        
        String numTxt = JOptionPane.showInputDialog("Enter a number");
        
        int num1 = Integer.parseInt(numTxt);
        
        numTxt = JOptionPane.showInputDialog("Enter another number");
        
        int num2 = Integer.parseInt(numTxt);
        
        int sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "Sum is: " + sum);
        
        
    } // end of main mehtod
}
