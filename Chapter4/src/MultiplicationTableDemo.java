
public class MultiplicationTableDemo {
    public static void main(String[] args) {
        
        System.out.println("Multiplication Table");
        System.out.println("========================");
        
        int num = 0;
        System.out.print("  ");
        while(num <= 10){
            System.out.printf("%6d", num);
            num++;     
        } // end of while loop
        System.out.println();
        
        int num1 = 0;
       // System.out.println("before seond while loop num is: " + num);
        while (num1 <= 10){
            num = 0;
            System.out.printf("\n%2d", num1);
            while (num<=10) {
                System.out.printf("%6d", + num1 * num);
                ++num;
            }
             System.out.println(num1);
             ++num1;
        } // end of 3nd while loop
        
        
        
    } // end of the main method
}
