
import javax.swing.JOptionPane;


public class SortingThreeNumbers {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Enter in an integer");
        String num2 = JOptionPane.showInputDialog("Enter in a second integer");
        String num3 = JOptionPane.showInputDialog("Enter in a third integer");
        
        int num1A = Integer.parseInt(num1);
        int num2A = Integer.parseInt(num2);
        int num3A = Integer.parseInt(num3);
        int temp = -1;
        int temp2 = -1;
        int temp3 = -1;
        
        
        if (num1A > num3A){
            temp = num1A;
            num1A = num3A;
            num3A = temp;
        }     
        if (num1A > num2A) {
            temp2 = num1A;
            num1A = num2A;
            num2A = temp2;
        }
        
        if (num2A > num3A) {
            temp3 = num2A;
            num2A = num3A;
            num3A = temp3;
        }
        
        
        JOptionPane.showMessageDialog(null, "Num1= " + num1A + "\nNum2= " + num2A + "\nNum3= " + num3A);
      /*  
        System.out.println("temp = " + temp);
        System.out.println("temp2 = " + temp2);
        System.out.println("num1A = " + num1A);    
        System.out.println("num2A = " + num2A);
        System.out.println("num3A = " + num3A);
      */
                
            
        
    } // end of the main method
   
}
