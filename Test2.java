package testNGPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

public class Test2 {
	
	
	//precondition annotations ---starting with @before
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty ("webdriver.gecko.driver","C:\\Users\\sonij\\OneDrive\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	   
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		
	}
	
	
	
	@Test //test case start with @test
	public void googleTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(invocationCount=2)
	public void googleLogoTest()
	{
	boolean b =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
	}

	@Test()
	public void maillinkTest()
	{
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	
	@Test
	public void sumation()
	{
		int b =3;
		int c =4;
		int sum = b+c;
		System.out.println(sum);
		
		Assert.assertEquals(7,sum);
	}
	//post conidition start with @after
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
