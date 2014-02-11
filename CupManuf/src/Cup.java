public class Cup {
    private boolean handle;         // instance variables.
    private String shape;
    private String material;
    private double volume;

    public Cup(){
        //System.out.println("Constructor method run");
        
        shape = "circle";
        material = "plastic";
        volume = 8.0;
        handle = false;
        
    } // the constructor method (is there whether I write it or not)
    
    public Cup(double v){
       setVolume(v);
       material = "plastic";
       handle = false;
       shape = "circle";
    }

    public Cup(boolean handle, String shape, String material, double volume) {
        this.handle = handle;
        this.shape = shape;
        this.material = material;
        this.volume = volume;
    }
    
    
    
    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        if(volume>=6 && volume<=32)
            this.volume = volume;
        else
            this.volume = 8.0;
    } 

    public static String getCompanyName(){
    return "ACME Cup Company";
    }
    
    public boolean isHandle() {
        return handle;
    }

    public void setHandle(boolean handle) {
        this.handle = handle;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String toString(){
    String output = "volume = " + volume;
    output += ", material = " + material;
    output +=", shape = " + shape;
    output += ", handle = " + handle;
        return output;
    }
    
    public boolean equals(Object o){
        Cup c = (Cup)o;
        
        if(this.volume == c.volume && this.material.equals(c.material) && this.shape.equals(c.shape && this.handle == c.handle))
        return true;
        else
            return false;
    }
} // end of class
