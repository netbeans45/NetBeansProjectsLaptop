
import javax.swing.JOptionPane;

// Tyler Coatsworth 12/3/2013

public class aJourneyBackInTime {
    public static void main(String[] args) {
        int dayOne;
         // asking user what year and first day of the year is. (example: 2001; 1 [for Sunday])
        String yearStr = JOptionPane.showInputDialog("Enter in the year: ");
            int year = Integer.parseInt (yearStr);
            do{
        String dayOneStr = JOptionPane.showInputDialog ("Enter in the first day of they year as an integer (example Sunday = 1, Saturday = 7): ");
            dayOne = Integer.parseInt (dayOneStr);}
            while(dayOne > 7 || dayOne < 1);
//            if(dayOne > 7){
//                dayOneStr = JOptionPane.showInputDialog ("ERROR: Please enter a valid day of the week");
//                dayOne = Integer.parseInt (dayOneStr);}
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        int daysInMonth[] = {32, 29, 32,31,32,31,32,32,31,32,31,32};
        
        if (isLeapYear)
            daysInMonth[1] = 30;
        
        int currentday = 1;
        int dayofweek = dayOne;
        
        for (int currentMonthPrinting = 1; currentMonthPrinting <= 12; currentMonthPrinting++){
            String month = "";
            
            switch(currentMonthPrinting){
                case 1: month = "Janurary"; break;
                case 2: month = "February"; break;
                case 3: month = "March"; break;
                case 4: month = "April"; break;
                case 5: month = "May"; break;
                case 6: month = "June"; break;
                case 7: month = "July"; break;
                case 8: month = "August"; break;
                case 9: month = "September";  break;
               case 10: month = "October"; break;
               case 11: month = "November"; break;
               case 12: month = "December";  break;
            }
            
            System.out.printf("\n\n%25s  %1s\n", month, yearStr);System.out.print("__________________________________________________\n");
            System.out.printf("%-4s   %-4s     %-4s    %-4s    %-4s    %-4s   %-4s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");
            
            for (int i = 1; i < daysInMonth[currentMonthPrinting-1]; i++) {
               if(i == 1){
               switch(dayofweek){
                   case 2: System.out.print("\t"); break;
                   case 3: System.out.print("\t \t"); break;
                   case 4: System.out.print("\t \t \t"); break;
                   case 5: System.out.print("\t \t \t \t"); break;
                   case 6: System.out.print("\t \t \t \t \t"); break;
                   case 7: System.out.print("\t \t \t \t \t \t"); break;
               }
               }
                System.out.print(currentday + "\t");   
               currentday++;
               dayofweek++;
               if (dayofweek > 7){
                   System.out.println("\n");
               dayofweek = 1;         
               }
               if(currentday == daysInMonth[currentMonthPrinting-1]){
                    currentday = 1;
               }     
            }
        } // end for loop
        System.out.println("");
    } // end of the main method   
}
