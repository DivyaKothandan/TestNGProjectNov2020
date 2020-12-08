package attributeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {
	WebDriver driver;
	
	@Test(dataProvider="getData")
	public void GoogleTest(String searchTerm) {		
	
	System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys(searchTerm);
	search.sendKeys(Keys.ENTER);
	}
	
	@DataProvider
	public Object[] getData() {
		Object[] data = new Object[3];		
		data[0]="Selenium";
		data[1]="Testng";
		data[2]="Java";		
		return data;
		
	}
}
