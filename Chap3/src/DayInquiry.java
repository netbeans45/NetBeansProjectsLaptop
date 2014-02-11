
import javax.swing.JOptionPane;

//@author Tyler Coatsworth 10/2/2013

public class DayInquiry {
    public static void main(String[] args) {
        String chosenMonth = JOptionPane.showInputDialog("Please enter in a number correlating to a month: ");
        int chosenMonthInt = Integer.parseInt (chosenMonth);

        String chosenYear = JOptionPane.showInputDialog("Now enter the year: ");
        int chosenYearInt = Integer.parseInt (chosenYear);
        String monthStr = Integer.toString(chosenMonthInt);
        
        
        if (chosenMonthInt == 1 ||chosenMonthInt ==  3 ||chosenMonthInt ==  5 ||chosenMonthInt ==  7 ||chosenMonthInt ==  8 ||chosenMonthInt ==  10 ||chosenMonthInt ==  12){
            switch(chosenMonthInt){
                case 1: monthStr = "January"; break;
                case 3: monthStr = "March"; break;
                case 5: monthStr = "May"; break;
                case 7: monthStr = "July"; break;
                case 8: monthStr = "August"; break;
                case 10: monthStr = "October"; break;
                case 12: monthStr = "December";break;        
            }     
            System.out.println(monthStr + ", " + chosenYearInt + " has 31 days.");
            
        }
        else if (chosenMonthInt == 4 ||chosenMonthInt ==  6 ||chosenMonthInt ==  9 ||chosenMonthInt ==  11){
            switch(chosenMonthInt){
            case 4: monthStr = "April"; break;
            case 6: monthStr = "June"; break;
            case 9: monthStr = "September"; break;
            case 11: monthStr = "November"; break;
            }
            System.out.println(monthStr + ", " + chosenYearInt + " has 30 days.");
        }
        else if (chosenMonthInt == 2){
            boolean isLeapYear = (chosenYearInt % 4 == 0 && chosenYearInt % 100 != 0) || (chosenYearInt % 400 == 0);
            if (isLeapYear)
            System.out.println( "February" + ", " + chosenYearInt + " has 29 days");
            else if (!isLeapYear)
                System.out.println( "February" + ", " + chosenYearInt + " has 28 days");
        }
        else
            System.out.println("Please enter a valid month/year!");
        
        
    }// end of the main method
}
