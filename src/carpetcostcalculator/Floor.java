package carpetcostcalculator;

public class Floor {
    private double width;
    private double length;
    //constructor
    public Floor(double width,double length){
       this.width = (width < 0)? 0 : width;
       this.length = (length < 0) ? 0 : length;
    }
    //Method to calculate area
    public double getArea(){
        return width * length;
    }
}
