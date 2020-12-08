package attributeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTestWiki {
	static WebDriver driver;
	
	@Test(dataProvider="getData")
	public void GoogleTest(String username, String password) throws Exception {		
	
	System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	
	
Thread.sleep(2000);
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement LoginTab = driver.findElement(By.linkText("Log in"));
	LoginTab.click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wpName1']")));
	WebElement UserName = driver.findElement(By.xpath("//*[@id='wpName1']"));
	UserName.clear();
	UserName.sendKeys(username);
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wpPassword1']")));
	WebElement Password =driver.findElement(By.xpath("//*[@id='wpPassword1']"));
	Password.clear();
	Password.sendKeys(password);
	driver.findElement(By.xpath("//*[@id='wpLoginAttempt']")).click();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];		
		data[0][0]="DivyaKothandan";
		data[0][1]="SeleniumTesting";
		
		data[1][0]="invalid username";
		data[1][1] = "invalid password";
		
		data[1][0]="valid username";
		data[1][1] = "invalid password";
		
		
		return data;
		
	}
}
