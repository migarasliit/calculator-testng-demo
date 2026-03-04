package com.sepqm.tests;

import com.sepqm.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorFixturesTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        // Runs before EACH test method
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        // Runs after EACH test method (cleanup)
        calculator = null;
    }

    @Test
    public void sub_shouldReturnCorrectValue() {
        Assert.assertEquals(calculator.sub(10, 3), 7);
    }

    @Test
    public void add_shouldWorkInCleanState() {
        Assert.assertEquals(calculator.add(1, 1), 2);
    }
}