
public class PrintAddressDemo {
    
    public static void companyMotto(){
        System.out.println("We Do Parties Right!");
    } // end of companyMotto method
    
    
    public static void main(String[] args) {
        System.out.println("Beginning of program");
        
        printAddress();
        printAddress();
        printAddress();
        printAddress();
        printAddress();
        printAddress();
        printAddress();
        
        
        
        System.out.println("End of program");
        
    } // end of the main method
    
    public static void printAddress(){
        int x = 10;
        while(x<20){
        System.out.println("Event Handlers Inc.");
        System.out.println("123 Main St");
        System.out.println("Oak Park, IL 60123");
        
        if (x < 11)
        companyMotto();
        
        
        x+=5;
        }
    } // end of print address method
    
    
} // end of class
