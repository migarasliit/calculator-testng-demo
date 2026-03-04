package com.sepqm.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CalculatorReportDemoTest {

    @Test
    public void reportDemo_shouldLogMessages() {
        Reporter.log("Starting report demo test...", true);

        int expected = 10;
        int actual = 5 + 5;

        Reporter.log("Expected value: " + expected, true);
        Reporter.log("Actual value: " + actual, true);

        Assert.assertEquals(actual, expected);

        Reporter.log("Report demo test completed successfully.", true);
    }
}