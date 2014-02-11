public class CupApp {
public static void main(String[] args) {
   
    
    System.out.println("Shipping Dept. Cup Application");
    System.out.println(Cup.getCompanyName());
    System.out.println("================================");
    
    Cup cup1 = new Cup();
    Cup cup2 = new Cup(16);
    
    cup1.setHandle(false);
    cup1.setMaterial("styrofoam");
    cup1.setShape("cone");
    cup1.setVolume(3.0);
    
    System.out.println("\tCup1 volume is: " + cup1.getVolume());
    System.out.println("\tCup1 material is: " + cup1.getMaterial());
    
    System.out.println("\tCup2 volume is: " + cup2.getVolume());
    System.out.println("\tCup2 material is: " + cup2.getMaterial());    
    
    cup2.setVolume(20.0);
    cup2.setMaterial("plastic");
    
    System.out.println("Updated info: ");
    System.out.println("\tCup2 volume is: " + cup2.getVolume());
    System.out.println("\tCup2 material is: " + cup2.getMaterial()); 
    
    Cup cup3 = new Cup();
    
    System.out.println(cup1);
    System.out.println(cup2);
    System.out.println(cup3);
    
    
    Cup cup8 = new Cup(true, "circle", "wood", 22.6);
    Cup cup9 = new Cup(true, "circle", "wood", 22.6);
    
    if(cup8 == cup9)
        System.out.println("they are equal");
    else 
        System.out.println("NOPE chuck testa");
    
    Cup cup7 = cup8;
    
        if(cup8 == cup7)
        System.out.println("they are equal");
    else 
        System.out.println("NOPE chuck testa");
    
       // cup8.setVolume(12);
    
        
        System.out.println("volume of cup 7 is: " + cup7.getVolume());
        
        if(cup8.equals(cup9))
        System.out.println("they are equal");
    else 
        System.out.println("NOPE chuck testa");
    } // end of the main method
   
}
