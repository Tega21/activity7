// Brandon Ortega// 12.10.2023// CST 239// Code was template from Activity 7

package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * The TestRunner class is used to run JUnit tests outside of an IDE's testing framework.
 * It utilizes JUnitCore to execute specified test classes and reports the test results. 
 */
public class TestRunner {

	/**
     * The main method to run the JUnit tests.
     * 
     * It uses JUnitCore to run the TestAssertions class and gathers the test results.
     * If there are any failures, it prints the details of each failure. Finally, it
     * reports whether all tests passed or if there were any failures.
     *
     * @param args Command line arguments (not used).
     */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestAssertions.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println("A JUnit test failed: " + failure.toString());
		}
		
		System.out.println("The JUnit tests " + (result.wasSuccessful() ? "Passed" : "Failed"));

	}

}
