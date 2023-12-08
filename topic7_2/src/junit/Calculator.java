// Brandon Ortega// 12.10.2023// CST 239// Code was template from Activity 7

package junit;

/**
 * The Calculator class provides basic arithmetic operations such as addition,
 * subtraction, multiplication, and division.
 */
public class Calculator {

    /**
     * Adds two integers.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public int add(int a, int b){
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     * 
     * @param a The integer to be subtracted from.
     * @param b The integer to subtract.
     * @return The difference of a and b.
     */
    public int subtract(int a, int b){
        return a - b;
    }

    /**
     * Multiplies two integers.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public int multiply(int a, int b){
        return a * b;
    }

    /**
     * Divides one integer by another.
     * 
     * @param a The numerator.
     * @param b The denominator.
     * @return The quotient of a divided by b.
     * @throws ArithmeticException If b is zero.
     */
    public int divide(int a, int b){
        return a / b;
    }

    /**
     * Main method for basic testing of the Calculator class.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("Adding 1 + 2 is: " + calc.add(1,2));
        System.out.println("Subtracting 2 from 1 is: " + calc.subtract(2,1));
        System.out.println("Multiplication of 10 and 2 is: " + calc.multiply(10, 2));
        System.out.println("Division of 10 by 2 is: " + calc.divide(10,2));

    }
}
