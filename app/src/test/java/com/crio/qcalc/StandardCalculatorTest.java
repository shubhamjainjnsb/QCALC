package com.crio.qcalc;

import com.crio.qcalc.StandardCalculatorTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardCalculatorTest {
   private StandardCalculator standardCalculator;

   @BeforeEach
   void setUp() {
      this.standardCalculator = new StandardCalculator();
   }

   @Test
   @DisplayName("Test Addition Overflow of Two Doubles")
   void testAdditionOverflowForDoubles() {
      Assertions.assertThrows(ArithmeticException.class, () -> {
         this.standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
      });
   }

   @Test
   @DisplayName("Test Subtraction Overflow of Two Doubles")
   void testSubtractionOverflowForDoubles() {
      Assertions.assertThrows(ArithmeticException.class, () -> {
         this.standardCalculator.subtract(-1.7976931348623157E308D, Double.MAX_VALUE);
      });
   }

   @Test
   @DisplayName("Test Multiplication Overflow of Two Doubles")
   void testMultiplicationOverflowForDoubles() {
      Assertions.assertThrows(ArithmeticException.class, () -> {
         this.standardCalculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
      });
   }

   @Test
   @DisplayName("Test Division Divide By Zero Scenario")
   void testDivisionDivideByZero() {
      Assertions.assertThrows(ArithmeticException.class, new 1(this));
   }

   @Test
   @DisplayName("Test Subtraction of Two Doubles")
   void testSubtractionOfTwoDoubles() {
      Assertions.assertThrows(ArithmeticException.class, () -> {
         this.standardCalculator.subtract(-1.7976931348623157E308D, Double.MAX_VALUE);
      });
   }

   @Test
   @DisplayName("Test Addition of Two Doubles")
   void testAdditionOfTwoDoubles() {
      Assertions.assertThrows(ArithmeticException.class, () -> {
         this.standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
      });
   }
}
