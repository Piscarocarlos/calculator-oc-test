package site.acatech.entity;

public class Calculator {
    private long firstNumber;
    private long secondNumber;

    public Calculator(long firstNumber, long secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Calculator() {
    }

    public long getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(long firstNumber) {
        this.firstNumber = firstNumber;
    }

    public long getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(long secondNumber) {
        this.secondNumber = secondNumber;
    }
}
