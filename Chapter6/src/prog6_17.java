
import javax.swing.JOptionPane;

// Tyler Coatsworth 11/21/2013

public class prog6_17 {
    public static void main(String[] args) {
        
      String numberOfGradesEntered =  JOptionPane.showInputDialog("How many grades will be entered?");
           int numGrades = Integer.parseInt(numberOfGradesEntered);
           
      String[] arrayNames =  new String[numGrades];
      double[] arrayGrades = new double[numGrades];
      
        for (int i = 0; i < numGrades; i++) {
            
           arrayNames[i] =  JOptionPane.showInputDialog("Enter name: ");
            
            
           String grades =  JOptionPane.showInputDialog("Enter grade: ");
            arrayGrades[i]= Double.parseDouble(grades);
           
        }
        
    //    printArrayNames(arrayNames);
      //  printArrayGrades(arrayGrades);
      //  System.out.println("");
        
                for (int i = 0; i < arrayGrades.length; i++) {
            double low = arrayGrades[i];
            String lowStr = arrayNames[i];
            int lowIndex = i;
            for (int j = i; j < arrayGrades.length; j++) {
                if(low > arrayGrades[j]){
                low = arrayGrades[j];
                lowStr = arrayNames[j];
                lowIndex = j;
                } // end of if
                
            } // end of inner for loop
            
            arrayGrades[lowIndex] = arrayGrades[i];
            arrayNames[lowIndex] = arrayNames[i]; 
           arrayGrades[i] = low;
           arrayNames[i] = lowStr;
        } // end of outer for loop
        
        printArrays(arrayNames, arrayGrades);
       // printArrays();         
                
        
    } // end of the main method
     public static void printArrays(String[] names, double[] grades){
         for (int i = grades.length - 1; i >= 0; i--) {
          System.out.printf("%-20s%5.2f",names[i] ,grades[i]);
             System.out.println("");
      }

}
//          public static void printArrayNames(String[] someArray){
//         for (int i = someArray.length - 1; i >= 0; i--) {
//          System.out.println(someArray[i]);
//          
//      }
//}
}