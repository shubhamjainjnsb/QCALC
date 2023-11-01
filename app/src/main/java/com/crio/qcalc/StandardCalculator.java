package com.crio.qcalc;

public class StandardCalculator {

    protected double result;

    public final void add(double num1, double num2) {
        double result = num1 + num2;

        if (Double.isInfinite(result) || Double.isNaN(result)) {
            throw new ArithmeticException("Double overflow");
        }

        this.result = result;
    }

    public final void subtract(double num1, double num2) {
        double result = num1 - num2;

        if (Double.isInfinite(result) || Double.isNaN(result)) {
            throw new ArithmeticException("Double overflow");
        }

        this.result = result;
    }

    public final void multiply(double num1, double num2) {
        double result = num1 * num2;

        if (Double.isInfinite(result) || Double.isNaN(result)) {
            throw new ArithmeticException("Double overflow");
        }

        this.result = result;
    }

    public final void divide(double num1, double num2) {
        if (num2 == 0.0) {
            throw new ArithmeticException("Divide By Zero");
        }
        result = num1 / num2;
    }

    public int getResult() {
        return (int) result;
    }

    public void clearResult() {
        result = 0;
    }

    public void printResult() {
        System.out.println("Standard Calculator Result: " + (int) result);
    }
}
