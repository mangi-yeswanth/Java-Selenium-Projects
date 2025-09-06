package com.example.excelseleniumtesting;
import com.example.excelseleniumtesting.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(priority = 1)
    public void testAdd() {
        int result = calculator.add(2, 3);
        Assert.assertEquals(result, 5);
        System.out.println("Executed testAdd");
    }

    @Test(priority = 2)
    public void testSubtract() {
        int result = calculator.subtract(5, 2);
        Assert.assertEquals(result, 3);
        System.out.println("Executed testSubtract");
    }
}