 
public class LoopingDemo {
    public static void main(String[] args) {
        
        int num1 =0;
        int x =0;
        
        while(num1 <= 10){
            System.out.println("num1 = " + num1);
                 num1++;
                 x = 10 * num1;
        }
          
          
        System.out.println("x is: " + x);
        System.out.println("end of while loop");
        
        System.out.println("==================================================");
        
        int num2 = 0;
        
        do{
            System.out.println("num2 is: " + num2++);
           // num2++:
        }while(num2 < 10);
        
        System.out.println("End of Do While Statement");
        System.out.println("==================================================");
          
        for (int num3=5; num3<=1500; num3*=5){
            System.out.println("num3 is: " + num3);
        }
        
    } // end of the main method
   
}
