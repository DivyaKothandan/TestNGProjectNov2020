package attributeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTestWiki {
	WebDriver driver;
	@Parameters({"browser","username","password"})
	@Test
	public void GoogleTest(String browser,String username,String password) throws Exception {
		
	if(browser.equals("chrome")) {	
	System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}
	
	else if(browser.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "D://Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}
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
	
@AfterClass
public void tearDown() {
	//driver.quit();
}
	
	
}
