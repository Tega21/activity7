// Brandon Ortega// 12.10.2023// CST 239// Code was template from Activity 7

package test;

import org.junit.Assert;
import org.junit.Test;

public class TestAssertions {
	
	@Test
	public void testAssertions() {
		// Test data
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		// Check that 2 objects are equal
		Assert.assertEquals(str1, str2);
		
		// Check if condition is true
		Assert.assertTrue(val1 < val2);
		
		// Check if condition is false
		Assert.assertFalse(val1 > val2);
		
		// check that an object isn't null
		Assert.assertNotNull(str1);
		
		// Check that an object is null
		Assert.assertNull(str3);
		
		// Check if two object reference points to same object
		Assert.assertSame(str4, str5);
		
		// Check if 2 object references not point to same object
		Assert.assertNotSame(str1, str3);
		
		// Check whether 2 arrays are equal to each other
		Assert.assertArrayEquals(expectedArray, resultArray);
		
	}

}
