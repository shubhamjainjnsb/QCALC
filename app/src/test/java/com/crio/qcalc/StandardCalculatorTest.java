package com.crio.qcalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StandardCalculatorTest {

    private StandardCalculator standardCalculator;

    @BeforeEach
    void setUp() {
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles() {
        // Assert that an ArithmeticException is thrown for overflow
        assertThrows(ArithmeticException.class, () -> {
            standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles() {
        // Assert that an ArithmeticException is thrown for overflow
        assertThrows(ArithmeticException.class, () -> {
            standardCalculator.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles")
    void testMultiplicationOverflowForDoubles() {
        // Assert that an ArithmeticException is thrown for overflow
        assertThrows(ArithmeticException.class, () -> {
            standardCalculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    @DisplayName("Test Division Overflow of Two Doubles")
    void testDivisionOverflowForDoubles() {
        // Assert that an ArithmeticException is thrown for overflow
        assertThrows(ArithmeticException.class, () -> {
            standardCalculator.divide(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    // Other test methods for arithmetic operations can be added here
}
