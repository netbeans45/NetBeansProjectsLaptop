
import javax.swing.JOptionPane;

// Tyler Coatsworth 
public class eight_one {

    public static void main(String[] args) {

        String r2hStr = JOptionPane.showInputDialog("Enter in height of 'rectangle2': ");
            double rec2h = Double.parseDouble(r2hStr);
        String r2wStr = JOptionPane.showInputDialog("Enter in width of 'rectangle2': ");
            double rec2w = Double.parseDouble(r2wStr);
            
            System.out.println("rectangle2 height set to: " + rec2h);
            System.out.println("rectangle2 width set to: " + rec2w);
            System.out.println("");
            
        String r3hStr = JOptionPane.showInputDialog("Enter in height of 'rectangle3': ");
            double rec3h = Double.parseDouble(r3hStr);
        String r3wStr = JOptionPane.showInputDialog("Enter in width of 'rectangle3': ");
            double rec3w = Double.parseDouble(r3wStr);
        
            System.out.println("rectangle3 height set to: " + rec3h);
            System.out.println("rectangle3 width set to: " + rec3w);
            
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(rec2h, rec2w);
        Rectangle rectangle3 = new Rectangle(rec3h, rec3w);


        
        rectangle2.getArea();
        rectangle2.getPerimeter();
        
        rectangle3.getArea();
        rectangle3.getPerimeter();
        System.out.println("");
        
        System.out.println("rectangle1: "); System.out.println(rectangle1);
        System.out.println("");
        System.out.println("rectangle2: ");System.out.println(rectangle2);
        System.out.println("");
        System.out.println("rectangle3: ");System.out.println(rectangle3);
        System.out.println("");

        rectangle2.setHeight(12.0);
        rectangle2.setWidth(6.0);
        System.out.println("---------------------------------");
        System.out.println("setHeight() setting rectangle2 height to 12.0");
        System.out.println("setWidth() setting rectangle2 width to 6.0");
        System.out.println("---------------------------------");
        
                System.out.println("rectangle1: "); System.out.println(rectangle1);
        System.out.println("");
        System.out.println("rectangle2: ");System.out.println(rectangle2);
        System.out.println("");
        System.out.println("rectangle3: ");System.out.println(rectangle3);
        System.out.println("");

    } // end of the main method
}
