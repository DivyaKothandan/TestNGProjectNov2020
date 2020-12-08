package testNGbasicAnnotations;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=-1,enabled=false)
	public void Registration() {
		System.out.println("Registration");
	}
	
	@Test(priority=0,description="Login testing in the application")
	public void login() {
		System.out.println("Login Test");
	}
	
	@Test(priority=1,description="Search Ticket testing in the application")
	public void searchTicket() {
		System.out.println("Search Ticket");
	}
	
	@Test(priority=2,description="Book Ticket testing in the application")
	public void bookTicket() {
		System.out.println("Book Ticket");
	}
	
	@Test(priority=3,description="Cancel Ticket testing in the application")
	public void cancelTicket() {
		System.out.println("Cancel Ticket");
	}

}
