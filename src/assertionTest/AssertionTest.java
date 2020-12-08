package assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
	//hard assertion
	@Test(priority=1)
	public void test() {
		System.out.println("Starting");
		int expected =1;
		int actual =2;
		Assert.assertEquals(expected, actual);
		System.out.println("Completed : Assertion Test");		
		System.out.println("TEsting completed after assertion");
	}
	
	@Test(priority=2)
	public void twotest() {
		System.out.println("Testing the assertion part 2");
		
	}

	
}
