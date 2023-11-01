package com.crio.qcalc;

public class StandardCalculator {

   protected double result;

   public final void add(double num1, double num2) {
       add((double)num1, (double)num2);
   }

   public final void subtract(double num1, double num2) {
       subtract((double)num1, (double)num2);
   }

   public final void multiply(double a, double a2) {
       multiply((double)a, (double)a2);
   }

   public final void divide(double num1, double num2) {
       divide((double)num1, (double)num2);
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
