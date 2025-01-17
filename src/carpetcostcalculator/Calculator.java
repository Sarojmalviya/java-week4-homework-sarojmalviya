package carpetcostcalculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;
    //constructor
    public Calculator(Floor floor,Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    //method to calculate total cost
    public  double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
