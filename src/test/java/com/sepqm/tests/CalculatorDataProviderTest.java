package com.sepqm.tests;

import com.sepqm.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorDataProviderTest {

    private final Calculator calculator = new Calculator();

    @DataProvider(name = "addData")
    public Object[][] addData() {
        return new Object[][]{
                {2, 3, 5},
                {0, 5, 5},
                {-2, 2, 0},
                {100, 200, 300}
        };
    }

    @Test(dataProvider = "addData")
    public void add_shouldHandleMultipleInputs(int a, int b, int expected) {
        Assert.assertEquals(calculator.add(a, b), expected);
    }
}