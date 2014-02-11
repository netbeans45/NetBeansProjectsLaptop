import javax.swing.JOptionPane;
 
// Author @Teezcoat 12/16/2013
 
public class MegaMillionsNumberGenerator {
     public static void main(String[] args) {
 
         String monthStr = JOptionPane.showInputDialog("Enter in the month of your birth (MM)");
             int month = Integer.parseInt(monthStr);
         String dayStr = JOptionPane.showInputDialog("Now enter in the day (DD)");
             int day = Integer.parseInt(dayStr);
         String yearStr = JOptionPane.showInputDialog("And the year of your birth (YYYY)");
             int year = Integer.parseInt(yearStr);
 
         int LN = calcLN(month,day,year);
 
         System.out.println(1234%10);
     } // end of the main method
    public static int calcLN(int mm, int dd, int yyyy){
      int result;
     int sum = mm + (dd/10) + (dd%10) + (yyyy/1000) + ((yyyy%1000)/100) + ((yyyy%100)/10) + (yyyy%10);
         if(sum<10 || sum==11 || sum==22 || sum==33){
             result = sum;
         }
         else{
            while 
             result = (sum/10) + (sum%10);
         }
     return result;
     }
}