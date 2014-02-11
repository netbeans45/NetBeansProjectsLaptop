
public class StringDemo1 {
    public static void main(String[] args) {
        
        String s1= "Merry Christmas";
        String s3 = new String("Merry Christmas");
        System.out.println(s1);
        
        System.out.println("First char is: " + s1.charAt(0));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(6));
        System.out.println(s1.substring(4, 8));
        
        int x = 20, y = 30;
        
        if(x == y)
            System.out.println("x is equal to y");
        else
            System.out.println("x is NOT equal to y");
        
        String s2 = "Merry Christmas";
        
        if(s1 == s2)
               System.out.println("s1 is equal to s2");
        else
            System.out.println("s1 is not equal to s2");
        
        if(s2 == s3)
               System.out.println("s2 is equal to s3");
        else
            System.out.println("s2 is not equal to s3");
        
        
         if(s2.equals(s3))
               System.out.println("s2 is equal to s3");
        else
            System.out.println("s2 is not equal to s3");
        
        
        String s4 = "Merry Christmas";
        
        
        
        
    } //end of the main method
}
