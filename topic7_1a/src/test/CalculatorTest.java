// Brandon Ortega// 12.10.2023// CST 239// Code was template from Activity 7

package test;

import org.junit.Assert;
import org.junit.Test;

import junit.Calculator;

/**
 * The CalculatorTest class contains JUnit tests for the Calculator class.
 * It tests each arithmetic operation (add, subtract, multiply, divide) to ensure correctness.
 * 
 */
public class CalculatorTest {
	
	/**
     * Tests the add method of Calculator.
     */
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assert.assertEquals(3, calc.add(2, 1));
        Assert.assertEquals(7, calc.add(5, 2));
        
    }

    /**
     * Tests the subtract method of Calculator.
     */
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Assert.assertEquals(1, calc.subtract(2, 1));
        Assert.assertEquals(3, calc.subtract(5, 2));
        
    }

    /**
     * Tests the multiply method of Calculator.
     */
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.multiply(2, 1));
        Assert.assertEquals(10, calc.multiply(5, 2));
    }

    /**
     * Tests the divide method of Calculator.
     */
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.divide(2, 1));
        Assert.assertEquals(2, calc.divide(5, 2));        
    }

}