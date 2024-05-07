package week4homework;

/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 */
public class Calculator {
    private double firstNumber;
    private double secondNumber;

    // Method to get firstNumber
    public double getFirstNumber() {
        return firstNumber;
    }

    // Method to get secondNumber
    public double getSecondNumber() {
        return secondNumber;
    }

    // Method to set firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Method to set secondNumber
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Method to get addition result
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // Method to get subtraction result
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // Method to get multiplication result
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // Method to get division result
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        Calculator calculator = new Calculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}


