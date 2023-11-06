package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println("Starting QCalc..");

        StandardCalculator calc = new StandardCalculator();

        float f1 = 234.5f;
        double d1 = 12.3;

        // Perform arithmetic operations
        calc.add(1, 2);
        calc.printResult();
        calc.clearResult();

        calc.subtract(5, 3);
        calc.printResult();
        calc.clearResult();

        calc.multiply(4, 3);
        calc.printResult();
        calc.clearResult();

        try {
            calc.divide(8, 4);
            calc.printResult();
            calc.clearResult();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            calc.clearResult();
        }

        // Check for potential overflow before performing additions
        double maxValue = Double.MAX_VALUE;
        double valueToAdd = 1.0;
        if (valueToAdd > 0 && maxValue > Double.MAX_VALUE - valueToAdd) {
            System.out.println("Adding 1.0 to Double.MAX_VALUE results in overflow.");
        } else if (valueToAdd < 0 && maxValue < -Double.MAX_VALUE - valueToAdd) {
            System.out.println("Adding -1.0 to -Double.MAX_VALUE results in overflow.");
        } else {
            calc.add(maxValue, valueToAdd);
            calc.printResult();
            calc.clearResult();
        }

        valueToAdd = Double.MAX_VALUE;
        if (valueToAdd > 0 && maxValue > Double.MAX_VALUE - valueToAdd) {
            System.out.println("Adding Double.MAX_VALUE to itself results in overflow.");
        } else if (valueToAdd < 0 && maxValue < -Double.MAX_VALUE - valueToAdd) {
            System.out.println("Adding -Double.MAX_VALUE to itself results in overflow.");
        } else {
            calc.add(maxValue, valueToAdd);
            calc.printResult();
        }

        LogicCalculator calc1 = new LogicCalculator();

        calc1.AND(8, 6);
        calc1.printResult();
    }
}
