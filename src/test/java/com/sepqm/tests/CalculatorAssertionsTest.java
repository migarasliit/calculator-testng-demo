package com.sepqm.tests;

import com.sepqm.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorAssertionsTest {

    @Test
    public void add_shouldReturnCorrectSum() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assert.assertEquals(result, 5, "Addition should return 5");
    }

    @Test
    public void div_byZero_shouldThrowException() {
        Calculator calculator = new Calculator();
        Assert.assertThrows(IllegalArgumentException.class, () -> calculator.div(10, 0));
    }

    @Test
    public void mul_shouldBePositiveForTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(4, 2);
        Assert.assertTrue(result > 0, "Result should be positive");
    }
}