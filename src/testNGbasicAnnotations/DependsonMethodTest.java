package testNGbasicAnnotations;

import org.testng.annotations.Test;

public class DependsonMethodTest {
	
	
	@Test(priority=1,dependsOnMethods="registration")
	public void login() {
		System.out.println("Login Test");
	}
	
	@Test(priority=3)
	public void bookTest() {
		System.out.println("Book Test");
	}
	
	@Test(priority=2)
	public void registration() {
		System.out.println("Registration");
	}
	
	
	
	

}
