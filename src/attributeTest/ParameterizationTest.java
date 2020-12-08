package attributeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTest {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void GoogleTest(String browser) {
		
	if(browser.equals("chrome")) {	
	System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	}
	
	else if(browser.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "D://Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	}
}
