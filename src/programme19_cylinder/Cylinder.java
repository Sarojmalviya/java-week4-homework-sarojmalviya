package programme19_cylinder;

public class Cylinder extends Circle{
    private double height;
    //constructor
    public Cylinder(double radius,double height){
        super(radius);
        this.height = (height < 0)?0 : height;
    }
    //Method to get height
    public double getHeight(){
        return height;
    }
    //Method to calculate volume
    public double getVolume(){
        return getArea() * height;
    }
}
