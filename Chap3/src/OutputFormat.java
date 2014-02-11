
import java.text.NumberFormat;


public class OutputFormat {
    public static void main(String[] args) {
        
        System.out.println("Today is \nMonday and \nit is kind of sunny");
        
        System.out.println("Here is \tsome more text \tto output");
        System.out.println("Here is \tother text \tto output");
        
        System.out.println("Tom says: \"test\"     ");
        System.out.println("The file is in directory: c:\\java\\tom\\big");
        
        System.out.println("====================================================");
        int num1 = 15, num2 = 89;
        
        double num3 = 45.6789; 
        double num4 = 12345.678980; 
        
        System.out.println("num4 is: " + num4 + "          num3 is: " + num3);
        
        System.out.printf("num4 is: %-20.2f num3 is: %.3f\n", num4, num3);
        // refer to page 113-115
        
        // String text = ("num4 is: %-20.2f num3 is: %.3f\n", num4, num3);
        NumberFormat form = NumberFormat.getNumberInstance();
        NumberFormat curr = NumberFormat.getCurrencyInstance();
        NumberFormat per = NumberFormat.getPercentInstance();
        
        System.out.println("Price is: " + form.format(num4));
        System.out.println("Price is: " + curr.format(num4));
        System.out.println("Price is: " + per.format(num4));
        
    } // end of the main method
}
