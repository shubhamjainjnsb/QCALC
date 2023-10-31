package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }




   

    @Test

    @DisplayName("Test Addition of Two Doubles")
    
    void testAdditionOperationForDoubles(){
    
            standardCalculator.add(1.0,1.5);
    
            double actualResult = standardCalculator.getResult();
    
            Assertions.assertEquals(2.5, actualResult);
    
    }
    
    
    @Test
    
    @DisplayName("Test Subtraction of Two Doubles")
    
    void testSubtractionOperationForDoubles(){
    
            standardCalculator.subtract(10.0,20.5);
    
            double actualResult = standardCalculator.getResult();
    
            Assertions.assertEquals(-10.5, actualResult);
    
    }
    @Test
    @DisplayName("Test Multiplication of Two Doubles")
    void testMultiplicationOperationForDoubles() {
        standardCalculator.multiply(2.5, 3.0); // Multiply two doubles
        double result = standardCalculator.getResult();
        Assertions.assertEquals(7.5, result, 0.0001); // Specify a delta for double comparison
    }

    @Test
    @DisplayName("Test Division of Two Doubles")
    void testDivisionOperationForDoubles() {
        standardCalculator.divide(10.0, 2.5); // Divide two doubles
        double result = standardCalculator.getResult();
        Assertions.assertEquals(4.0, result, 0.0001); // Specify a delta for double comparison
    }
    
    


}
