package attributeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParralleTest {
	
	WebDriver driver;
	@Test
	public void googleTest() {
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void facebookTest() {
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
