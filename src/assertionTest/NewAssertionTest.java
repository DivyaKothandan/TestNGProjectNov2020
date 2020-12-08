package assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewAssertionTest {
	
	@Test(priority=1)
	public void test() {
		System.out.println("Starting");
		int expected =1;
		int actual =2;
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(expected, actual);
		System.out.println("Completed : Assertion Test");
		System.out.println("TEsting completed after assertion");
		assertion.assertAll();
		
		
	}
	
	
	@Test(priority=2)
	public void twotest() {
		System.out.println("Testing the assertion part 2");
		
	}

	
}
