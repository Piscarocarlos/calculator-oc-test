package site.acatech.service;

import site.acatech.entity.Calculator;

public class CalculatorService {
    private Calculator calculator = new Calculator();


    public long add(long a, long b) {
        return a + b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}
