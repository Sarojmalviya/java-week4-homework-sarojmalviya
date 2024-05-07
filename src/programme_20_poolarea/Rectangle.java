package programme_20_poolarea;

public class Rectangle {
    private double width;
    private double length;
    //constructor
    public Rectangle(double width,double length){
        this.width = (width < 0)? 0 : width;
        this.length = (length < 0)? 0 : length;
    }
    //Method to get width
    public double getWidth(){
        return width;
    }
    //method to get length
    public double getLength(){
        return length;
    }
    //Method to calculate area
    public double getArea(){
        return width * length;
    }
}
