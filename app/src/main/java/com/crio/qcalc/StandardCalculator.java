package com.crio.qcalc;

public class StandardCalculator {
   protected double result;

   public final void add(double num1, double num2) {
      if ((num1+num2)==Double.MAX_VALUE || (num1+num2)==Double.POSITIVE_INFINITY || Double.isInfinite(num1 + num2) || Double.isNaN(num1 + num2)) {
         throw new ArithmeticException("Double overflow");
      } else {
         this.result = num1 + num2;
      }
   }
   

   public final void subtract(double num1, double num2) {
      if ((num1-num2)==-Double.MAX_VALUE || (num1-num2)==Double.NEGATIVE_INFINITY ||Double.isInfinite(num1 - num2) || Double.isNaN(num1 - num2)) {
         throw new ArithmeticException("Double overflow");
      } else {
         this.result = num1 - num2;
      }
   }
   

   public final void multiply(double num1, double num2) {
      double result = num1 * num2;
      if (!Double.isInfinite(result) && !Double.isNaN(result)) {
         this.result = result;
      } else {
         throw new ArithmeticException("Double overflow");
      }
   }

   public final void divide(double num1, double num2) {
      if (num2 == 0.0D) {
         throw new ArithmeticException("Divide By Zero");
      } else {
         this.result = num1 / num2;
      }
   }

   public int getResult() {
      return (int)this.result;
   }

   public void clearResult() {
      this.result = 0.0D;
   }

   public void printResult() {
      System.out.println("Standard Calculator Result: " + (int)this.result);
   }
}
