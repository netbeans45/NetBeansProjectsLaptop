
import javax.swing.JOptionPane;

public class ArrayDemo1 {
    public static void main(String[] args) {
        
       int x = 67; 
        
       int[] grades = new int [7];
       
       grades[6] = 100;
       grades[5] = 99;
       grades[4] = 77;
       grades[3] = 98;
       grades[2] = 88;
       grades[1] = 70;
       grades[0] = 92;
       
        System.out.println(" x is: " + x);
        System.out.println("fourth grade is: " + grades[3]);
        
        System.out.println("Array of grades is: " + grades);
        
    //    for(int i = grades.length-1; i > 3; i--){
        for (int i = 0; i < grades.length; i++) {
            
  
            System.out.printf("%-5d", grades[i]);
        } // end of for loop
        
        System.out.println();
        
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
            
        }
        int avg = total / grades.length;
        
        System.out.println("Average grade is: " + avg);
        
        
        
        
        String gradeSearchTxt = 
                JOptionPane.showInputDialog("Enter grade to search for: ");
                
        int grade = Integer.parseInt(gradeSearchTxt);
        
        boolean isGradeThere = false;
        
        for (int i = 0; i < grades.length; i++) {
            
            if(grades[i] == grade){
            isGradeThere = true;
            break;
            } // end of if
            
        } // end of for loop
        
        if(isGradeThere){
            System.out.println("The " + grade + " is in the array");
        }
        else 
            System.out.println("The " + grade + " is NOT in the array");
    } // end of the main method
}
