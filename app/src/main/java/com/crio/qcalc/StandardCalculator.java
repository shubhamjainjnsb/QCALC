package com.crio.qcalc;

public class StandardCalculator {

   private double result; // Change the data type of result to double

   public void add(int num1, int num2) {
       add((double) num1, (double) num2);
   }

   public void add(double num1, double num2) {
       result = num1 + num2;
   }

   public void subtract(int num1, int num2) {
       subtract((double) num1, (double) num2);
   }

   public void subtract(double num1, double num2) {
       result = num1 - num2;
   }

   public void multiply(int num1, int num2) {
       multiply((double) num1, (double) num2);
   }

   public void multiply(double num1, double num2) {
       result = num1 * num2;
   }

   public void divide(int num1, int num2) {
       divide((double) num1, (double) num2);
   }

   public void divide(double num1, double num2) {
       if (num2 != 0) {
           result = num1 / num2;
       } else {
           System.out.println("Error: Division by zero is not allowed.");
           clearResult();
       }
   }

   public double getResult() { // Change the return type of getResult to double
       return result;
   }

   public void clearResult() {
       result = 0.0;
   }

   public void printResult() {
       System.out.println("Standard Calculator Result: " + result);
   }
}
