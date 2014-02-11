// Tyler Coatsworth 10/18/2013

public class milesToKilo {
    public static void main(String[] args) {
        
        int miles = 1;
        int kilometers = 20;
        int runCount = 1;
        
        System.out.printf("    %7s     %7s   |     %7s     %7s  \n","Miles", "Kilometers", "Kilometers", "Miles");
       
        while (runCount <= 10){
            System.out.printf("%7d       %7.3f        |%7d              %7.3f  \n", miles, miles * 1.609, kilometers, kilometers / 1.609);
            //System.out.printf(miles + "     " + miles * 1.609 + "    " + "|" + "     " + kilometers + "     " + kilometers / 1.609 + "\n");
        
        miles++;    
        kilometers+=5;    
        runCount++;
        }
        
        
    } // end of the main method
}
