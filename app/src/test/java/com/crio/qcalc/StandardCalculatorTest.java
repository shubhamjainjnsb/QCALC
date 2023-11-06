package com.crio.qcalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.Assertions;

public class StandardCalculatorTest {

    private StandardCalculator standardCalculator;

    @BeforeEach
    void setUp() {
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles() {
        assertThrows(ArithmeticException.class, () -> {
            standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles() {
        assertThrows(ArithmeticException.class, () -> {
            standardCalculator.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles")
    void testMultiplicationOverflowForDoubles() {
        assertThrows(ArithmeticException.class, () -> {
            standardCalculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }



    @Test
    @DisplayName("Test Division Divide By Zero Scenario")
    void testDivisionDivideByZero() {
        Assertions.assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                standardCalculator.divide(10, 0);
            }
        });
    }
    @Test
    @DisplayName("Test Subtraction of Two Doubles")
    void testSubtractionOfTwoDoubles() {
        assertThrows(ArithmeticException.class, () -> {
            standardCalculator.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
    });
}

    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOfTwoDoubles() {
        assertThrows(ArithmeticException.class, () -> {
            standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    // Other test methods for arithmetic operations can be added here
}
