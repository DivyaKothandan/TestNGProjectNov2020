package testNGbasicAnnotations;

import org.testng.annotations.Test;

public class GroupingTesting {
	@Test(enabled=false)
	public void Registration() {
		System.out.println("Registration");
	}
	
	@Test(description="Login testing in the application",groups="Login")
	public void login() {
		System.out.println("Login Test");
	}
	
	@Test(description="Forgot Usename testing in the application",groups="Login")
	public void forgotUsername() {
		System.out.println("Forgot Usename Test");
	}
	
	@Test(description="Search Ticket testing in the application",groups="Search")
	public void searchTicket() {
		System.out.println("Search Ticket");
	}
	@Test(description="Search Ticket - Select Date testing in the application",groups="Search")
	public void selectDataTicket() {
		System.out.println("Select Date Search Ticket");
	}
	
	@Test(description="Book Ticket testing in the application",groups= {"Book","Regression"})
	public void bookTicket() {
		System.out.println("Book Ticket");
	}
	
	@Test(description="Book Ticket - Gpay testing in the application",groups="Book")
	public void gPaybookTicket() {
		System.out.println("Book Ticket - Gpay");
	}
	
	@Test(description="Book Ticket - Card testing in the application",groups="Book")
	public void cardbookTicket() {
		System.out.println("Book Ticket - Card");
	}
	
	@Test(description="Cancel Ticket testing in the application",groups="Cancel")
	public void cancelTicket() {
		System.out.println("Cancel Ticket");
	}

}
