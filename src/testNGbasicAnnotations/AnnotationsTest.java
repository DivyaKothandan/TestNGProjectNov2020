package testNGbasicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {
	
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before Suite");	
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");	
	}
	
	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Class");	
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method");	
	}
	
	@AfterTest
	public void afterTest() {
	System.out.println("After Test");	
	}
	@AfterClass
	public void afterClass() {
	System.out.println("After Class");	
	}
	
	/*@Test(invocationCount=5)
	public void test() {
	System.out.println("Test");	
	}*/
	@Test
	public void onetest() {
		System.out.println("oneTest");	
		}
	
	//@Test(expectedExceptions= {Exception.class})
	@Test()
	public void twotest() {
		System.out.println(9/0);
		System.out.println("twoTest");	
		}
	
	
	@AfterSuite
	public void afterSuite() {
	System.out.println("After Suite");	
	}
	@BeforeTest
	public void beforeTest() {
	System.out.println("Before Test");	
	}

}
