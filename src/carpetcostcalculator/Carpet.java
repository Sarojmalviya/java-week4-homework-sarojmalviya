package carpetcostcalculator;

public class Carpet {
    private double cost;
    //constructor
    public Carpet(double cost){
        this.cost = (cost < 0)? 0 : cost;
    }
    //Method to get cost
    public double getCost(){
        return cost;
    }
}
