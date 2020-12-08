package NewassertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
	
	@Test
	public void test() {
		System.out.println("Starting");
		int expected =1;
		int actual =2;
		Assert.assertEquals(expected, actual);
		System.out.println("Completed : Assertion Test");
	}

	
}
