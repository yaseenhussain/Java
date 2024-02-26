package OOP.part1;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber; // this.firstNumber
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.secondNumber * this.firstNumber;
    }

    public double getDivisionResult(){
        if (secondNumber == 0) return 0;
        return this.firstNumber / this.secondNumber;
    }
}


