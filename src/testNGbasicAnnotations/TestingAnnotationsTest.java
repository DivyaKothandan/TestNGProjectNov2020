package testNGbasicAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingAnnotationsTest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void openNetwork() {
	System.out.println("Opening the network");	
	}
	
	@BeforeMethod
	public void login() throws Exception {
		
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pt-login']/a")));
	//	WebElement LoginTab = driver.findElement(By.xpath("//*[@id='pt-login']/a"));
		WebElement LoginTab = driver.findElement(By.linkText("Log in"));
		LoginTab.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wpName1']")));
		WebElement UserName = driver.findElement(By.xpath("//*[@id='wpName1']"));
		UserName.clear();
		UserName.sendKeys("DivyaKothandan");
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wpPassword1']")));
		WebElement Password =driver.findElement(By.xpath("//*[@id='wpPassword1']"));
		Password.clear();
		Password.sendKeys("SeleniumTesting");
		driver.findElement(By.xpath("//*[@id='wpLoginAttempt']")).click();
	}
	
	@BeforeClass
	public void launchURL() {
	driver.manage().window().maximize();
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}
	
	@AfterMethod
	public void logOut() {
	driver.findElement(By.xpath("//*[@id='pt-logout']/a")).click();
	}
	
	@AfterTest
	public void afterTest() {
	driver.quit();	
	}
	@AfterClass
	public void closeBrowser() {
	System.out.println("Closing the browser");	
	}
	
	@Test(priority=0)
	public void contactPageTest() {
	driver.findElement(By.xpath("//*[@id='n-contactpage']/a")).click();
	String ExpectedTitle= "Wikipedia:Contact us - Wikipedia";
	String ActualTitle = driver.getTitle();
	/*if(ExpectedTitle.equals(ActualTitle)) {
		System.out.println("Navigated to Contacts Page");
	}
	else
	{
		System.out.println("Not Navigate to Contact page");
	}*/
	
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	
	@Test(priority=1)
	public void aboutWikiPage() {
		driver.findElement(By.xpath("//*[@id='n-aboutsite']/a")).click();
		String ExpectedURL= "https://en.wikipedia.org/wiki/Wikipedia:About";
		String ActualURL = driver.getCurrentUrl();
		Assert.assertEquals(ExpectedURL, ActualURL);
	}
	
	@AfterSuite
	public void closeNetwork() {
	System.out.println("Closing Network");	
	}
	@BeforeTest
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	}

}
