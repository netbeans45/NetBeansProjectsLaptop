
public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = width * height;
        return area;
    }
    
    public double getPerimeter(){
        double perimeter = (width * 2) + (height * 2);
        return perimeter;
    }
    
        public String toString(){
    String output = "Height = " + height;
    output += ", Width = " + width;
    output +=", Area = " + getArea();
    output += ", Perimeter = " + getPerimeter();
        return output;
    }
} // end of Rectangle
