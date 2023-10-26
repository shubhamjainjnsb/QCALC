package com.crio.qcalc;

public class StandardCalculator {

   private int result;

   public void add(int num1, int num2) {
       result = num1 + num2;
   }

   public void subtract(int num1, int num2) {
       result = num1 - num2;
   }

   public void multiply(int num1, int num2) {
       result = num1 * num2;
   }

   public void divide(int num1, int num2) {
       if (num2 != 0) {
           result = num1 / num2;
       } else {
           System.out.println("Error: Division by zero is not allowed.");
           clearResult();
       }
   }

   public int getResult() {
       return result;
   }

   public void clearResult() {
       result = 0;
   }

   public void printResult() {
       System.out.println("Standard Calculator Result: " + result);
   }
}
