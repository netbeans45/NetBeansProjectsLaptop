
package javaapplication1;


public class OperatorsDemo {
    public static void main(String[] args) {
        int num1 = 36;
        
        double num2 =78.56;
        
        char letter = 'B';
        
        boolean isGood = true;
        
        System.out.println("Tne value of letter is: " + letter);
        System.out.println("The value of num1 is: " + num1);
        System.out.println("The value of isGood is: " + isGood);
        
        num1 = 20;
        
        isGood = false;
        
        int num3 = 10, num4 = 20;
        
        int sum, sub, prod, div, mod;
        
        
        sum = num3 + num4;
        
        sub = num3 - num4;
        
        prod = num3 * num4;
        
        div = num3 / num4;
        
        mod = num3 % num4; // this is the modulus operator.
        
        System.out.println("Sub is: " + sub + " Prod is: " + prod + " Div is: " + div + " Mod is: " + mod);
        
        
        int result = 2 * ((6 + 8) / 12) ^ 23;
        
        System.out.println(result);
        
        //contants
        
        final int NUM9 = 10;
        
        
        
        
    }
}
