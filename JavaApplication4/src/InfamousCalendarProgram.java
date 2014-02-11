
import javax.swing.JOptionPane;

// Tyler Coatsworth 10/19/2013

/******************************************************************************************
 * Can we please go over a more efficient solution in class for this program? 
 * Or at least general guidelines for a more efficient looping solution?
 * Because my feeble attempt at this program is just plain miserable, and quite depressing
 * as it required heavily on providing an output for every scenario rather than effective
 * looping techniques.
 * Thanks in advance!
 * - Tyler C.
 ******************************************************************************************/


public class InfamousCalendarProgram {
    public static void main(String[] args) {
        // asking user what year and first day of the year is. (example: 2001; 1 [for Sunday])
        String yearStr = JOptionPane.showInputDialog("Enter in the year: ");
            int year = Integer.parseInt (yearStr);
        String dayOneStr = JOptionPane.showInputDialog ("Enter in the first day of they year as an integer (example Sunday = 1, Saturday = 7): ");
            int dayOne = Integer.parseInt (dayOneStr);
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
       
        
        for (int currentMonthPrinting = 1; currentMonthPrinting <= 12; currentMonthPrinting++){
            // switch checks what month is being printed -- correlates to literal string of month plus required formating attached.
           switch (currentMonthPrinting){
               case 1:System.out.printf("%50s  %1s\n", "January", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 2:System.out.printf("%50s  %1s\n", "February", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 3:System.out.printf("%50s  %1s\n", "March", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 4:System.out.printf("%50s  %1s\n", "April", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 5:System.out.printf("%50s  %1s\n", "May", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 6:System.out.printf("%50s  %1s\n", "June", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 7:System.out.printf("%50s  %1s\n", "July", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 8:System.out.printf("%50s  %1s\n", "August", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 9:System.out.printf("%50s  %1s\n", "September", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 10:System.out.printf("%50s  %1s\n", "October", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 11:System.out.printf("%50s  %1s\n", "November", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
               case 12:System.out.printf("%50s  %1s\n", "December", yearStr);System.out.print("       ______________________________________________________________________________________\n");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat");break;
                   
           }
            // Switch checks case for first day of the year. 
        switch (dayOne){
           // if it was a Sunday:
            case 1:
                // resulting if statements check what month we are currently printing and print the nessesary printf statements to complete desired month.
            if (currentMonthPrinting == 1){
            System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "1", "2", "3", "4","5", "6", "7");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "8", "9", "10", "11","12", "13", "14");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "15", "16", "17", "18","19", "20", "21");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "22", "23", "24", "25","26", "27", "28");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "29", "30", "31", "  ","  ", "  ", "  "); }
            
            if (currentMonthPrinting == 2 && isLeapYear == false){       
            System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", "1","2", "3", "4");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "5", "6", "7", "8","9", "10", "11");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "12", "13", "14", "15","16", "17", "18");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "19", "20", "21", "22","23", "24", "25");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "26", "27", "28", "  ","  ", "  ", "  ");}
           
            if (currentMonthPrinting == 3){System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", "1","2", "3", "4");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "5", "6", "7", "8","9", "10", "11");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "12", "13", "14", "15","16", "17", "18");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "19", "20", "21", "22","23", "24", "25");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "26", "27", "28", "29","30", "31", "  ");}
            
            if (currentMonthPrinting == 4){System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", " "," ", " ", "1");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "2", "3", "4", "5","6", "7", "8");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "9", "10", "11", "12","13", "14", "15");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "16", "17", "18", "19","20", "21", "22");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "23", "24", "25", "26","27", "28", "29");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "30", "  ", "  ", "  ","  ", "  ", "  ");}
            
            if (currentMonthPrinting == 5){System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", "1", "2", "3","4", "5", "6");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "7", "8", "9", "10","11", "12", "13");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "14", "15", "16", "17","18", "19", "20");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "21", "22", "23", "24","25", "26", "27");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "28", "29", "30", "31","  ", "  ", "  ");}

            if (currentMonthPrinting == 6){System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", " ","1", "2", "3");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "4", "5", "6", "7","8", "9", "10");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "11", "12", "13", "14","15", "16", "17");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "18", "19", "20", "21","22", "23", "24");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "25", "26", "27", "28","29", "30", "31");}
            
            if (currentMonthPrinting == 7){//{System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", " "," ", "1", "2");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "3", "4", "5", "6","7", "8", "9");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "10", "11", "12", "13","14", "15", "16");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "17", "18", "19", "20","21", "22", "23");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "24", "25", "26", "27","28", "29", "30");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "31", "  ", "  ", "  ","  ", "  ", "  ");}
            System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "1", "2", "3", "4","5", "6", "7");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "8", "9", "10", "11","12", "13", "14");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "15", "16", "17", "18","19", "20", "21");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "22", "23", "24", "25","26", "27", "28");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "29", "30", "31", "  ","  ", "  ", "  "); }

                
            if (currentMonthPrinting == 8)
                    
            if (currentMonthPrinting == 9)
                        
            if (currentMonthPrinting == 10)
                            
            if (currentMonthPrinting == 11)
                                
            if (currentMonthPrinting == 12)
            //---------------------------------------------------------------
            if (currentMonthPrinting == 2 && isLeapYear == true){
            System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", "1","2", "3", "4");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "5", "6", "7", "8","9", "10", "11");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "12", "13", "14", "15","16", "17", "18");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "19", "20", "21", "22","23", "24", "25");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "26", "27", "28", "29","  ", "  ", "  ");}break;
            //===============================================================
            
            
            // if first day of year was a Monday
            case 2:System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", "1", "2", "3","4", "5", "6");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "7", "8", "9", "10","11", "12", "13");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "14", "15", "16", "17","18", "19", "20");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "21", "22", "23", "24","25", "26", "27");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "28", "29", "30", "31","  ", "  ", "  ");break;
            // if first day of year was a Tuesday
            case 3:System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", "1", "2","3", "4", "5");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "6", "7", "8", "9","10", "11", "12");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "13", "14", "15", "16","17", "18", "19");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "20", "21", "22", "23","24", "25", "26");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "27", "28", "29", "30","31", "  ", "  ");break;
            // if first day of year was a Wednesday
            case 4:System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", "1","2", "3", "4");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "5", "6", "7", "8","9", "10", "11");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "12", "13", "14", "15","16", "17", "18");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "19", "20", "21", "22","23", "24", "25");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "26", "27", "28", "29","30", "31", "  ");break;
            // if first day of year was a Thursday
            case 5:System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", " ","1", "2", "3");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "4", "5", "6", "7","8", "9", "10");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "11", "12", "13", "14","15", "16", "17");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "18", "19", "20", "21","22", "23", "24");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "25", "26", "27", "28","29", "30", "31");break;
            // if first day of year was a Friday
            case 6:System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", " "," ", "1", "2");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "3", "4", "5", "6","7", "8", "9");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "10", "11", "12", "13","14", "15", "16");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "17", "18", "19", "20","21", "22", "23");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "24", "25", "26", "27","28", "29", "30");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "31", "  ", "  ", "  ","  ", "  ", "  ");break;
            // if first day of year was a Saturday
            case 7:System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", " ", " ", " ", " "," ", " ", "1");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "2", "3", "4", "5","6", "7", "8");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "9", "10", "11", "12","13", "14", "15");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "16", "17", "18", "19","20", "21", "22");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "23", "24", "25", "26","27", "28", "29");System.out.printf("%10s   %10s     %10s    %10s    %10s    %10s   %10s\n", "30", "31", "  ", "  ","  ", "  ", "  ");break;                   
        
        }
        //}
        
        
        }
        if(dayOne < 1 || dayOne > 7)
            JOptionPane.showMessageDialog(null, "Please enter a valid day of the week.");
    } // end of the main method
}
