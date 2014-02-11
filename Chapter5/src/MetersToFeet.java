// Tyler Coatsworth 10/30/2013
 /* I just want to go on record and say that the books given formula of "foot = 3.279 * meter" IS A IIE */
public class MetersToFeet {
     public static void main(String[] args) {
 
         
         
         int newdig = 53 % 10;
         
         System.out.println(newdig);
         
         
         double foot = 1.0;
         double meter = 20.0;
         System.out.printf("%10s        %10s       |  %10s      %10s \n","Feet", "Meters", "Meters", "Feet");
         System.out.println(" ----------------------------------|--------------------------------");
 
         while (foot <= 10.0){
 
             System.out.printf("%10.1f       %10.3f        |%10.1f         %10.3f  \n",  foot,  footToMeter(foot),  meter,   meterToFoot(meter));
 
             foot += 1.0;
             meter += 5.0;
         }
 
 
 
 
     } //  end of the main method
     public static double footToMeter(double foot){
         double meter = 0.305 * foot;
         return meter;
     } // end of footToMeter
     public static double meterToFoot(double meter){
         double foot = (meter / 0.305); // the proper way to calculate 
         return foot;
     } // end of meterToFoot
}