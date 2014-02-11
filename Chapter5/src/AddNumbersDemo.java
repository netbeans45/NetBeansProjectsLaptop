
public class AddNumbersDemo {
    public static void main(String[] args) {
        System.out.println("Begin Program");
        System.out.println("====================");
        
        int x = 20;
        int y = 15;
        
        int total = addNumbers(x, y);
        System.out.println("X + Y is : " + total);
        
        System.out.println("X is: " + x);
        
        for(int i = 0; i < 10; i+=2)
            System.out.println(" total is: " + addNumbers(i, i+5));
            
        
        int someNum = 45 - 16 * 20 / addNumbers(56, 12);
        
        System.out.println("someNum is: " + someNum);  
        
        System.out.println("====================");
        System.out.println("End of Program");
        
    } // end of the main method
    
    public static int addNumbers(int num1, int num2){
        //int num1 = 10, num2 = 15;
        num1 += 10;
        int sum = num1 + num2;
        
        
        return sum;
      //  System.out.println("sum of num1 + num2 is: " + (num1+num2));
    }
    
} // end of the class
