package programme19_cylinder;

public class Circle {
    private double radius;
    //constructor
    public Circle(double radius){
        this.radius = (radius < 0)?0:radius;
    }
    //Method to get radius
    public double getRadius(){
        return radius;
    }
    //Method to calculate area
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
