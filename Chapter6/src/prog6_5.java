
import javax.swing.JOptionPane;

// Tyler Coatsworth 11/21/2013
public class prog6_5 {
    public static void main(String[] args) {
        
        int numbers[] = new int [10];
        
        
        for (int i = 0; i < 10; i++) {
          
          String entereddigitalnumberalviathedialogbox = JOptionPane.showInputDialog("Enter in a number [" + (i+1) + "/10]: ");
               numbers[i] = Integer.parseInt(entereddigitalnumberalviathedialogbox);
         
        }
         String output = "The distinct numbers are:   ";
        
       // System.out.print("The distinct numbers are: ");
        shakeAndBake(numbers, output);
        System.out.println("");
        
    } // end of the main method
    
   
    
      public static void shakeAndBake(int[] numbers,String output) {
  for (int i = 0; i < numbers.length; i++) {
    boolean inArray = false;
    for (int j = 0; j < i; j++)
      if (numbers[i] == numbers[j]) {
        inArray = true;
        break;
      }
    if (!inArray){

        output += numbers[i] + "   ";
    }
    
  }
  JOptionPane.showMessageDialog(null, output);
}
      
}