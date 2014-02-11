
public class SwitchDemi {
    public static void main(String[] args) {
        
        int num = 8;
        int y = -1;
        
        switch(num){
            case 7: case 8: case 32:
                System.out.println("num is 7");
                System.out.println("Today is Friday");
                y = 25;
                break;
            case 9:
                System.out.println("num is 9");
                break;
            case 4:
                System.out.println("num is 4");
                break;
            default: 
                System.out.println("num is not 4,7, or 9");
        } // end of switch
        
        if(y <0)
            System.out.println("y is not set");
            
        
        System.out.println("y is: " + y);
        System.out.println("End of program");
        
    } // end of main method
}
