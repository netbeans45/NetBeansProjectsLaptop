public class MarketingCupApp {
    public static void main(String[] args) {
   
        System.out.println("Marketing Cup Application");
        System.out.println(Cup.getCompanyName());
        System.out.println("==============================");
        
        Cup cup1 = new Cup();
        Cup cup2 = new Cup(20);
        Cup cup3 = new Cup(true, "square", "metal", 20.6);
        
        cup1.setVolume(12.0);
        cup1.setMaterial("plastic");
        
        
        System.out.println("Cup1 volume is: " + cup1.getVolume());
        System.out.println("Cup1 material is: " + cup1.getMaterial());
        
        
    } // enf of the main method

}
