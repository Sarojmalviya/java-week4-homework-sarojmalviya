package programme_20_poolarea;

public class Cuboid extends Rectangle {
    private double height;
    //constructor
    public Cuboid(double width,double length,double height){
        super(width, length);
        this.height = (height < 0)?0 : height;
    }
    //Method to get height
     public double getHeight(){
        return height;
     }
     //Method to calculate volume
    public double getVolume(){
        return getArea()*height;
    }
}
