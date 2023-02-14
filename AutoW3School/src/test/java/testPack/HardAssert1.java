package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import W3TestPack.W3LoginPage;

public class HardAssert1 {
	
	private WebDriver driver;
	private W3LoginPage w3loginPage;
	String actualTitle;
	String expectedTitle;
	//SoftAssert soft;
	@BeforeTest
	public void beforeTest()
    {
		System.out.println("BeforeClass");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishna\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		w3loginPage= new W3LoginPage(driver);
		w3loginPage.clickOnlogin();
		w3loginPage.clickOnsignUp();
		System.out.println("test1");
		actualTitle = driver.getTitle();
		//String actualurl = driver.getCurrentUrl();
		expectedTitle = "Log in - W3Schools";
		//String expectedUrl="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void verifyloginPage()
	{
		System.out.println("test2");
		Assert.assertEquals(actualTitle,  expectedTitle, "Wrong Title");
		boolean result = actualTitle.equals(expectedTitle);
		Assert.assertTrue(result, "Right Title");
	}
	@Test
	public void verifyloginPage1()
	{
		System.out.println("test3");
		Assert.assertEquals(actualTitle,  expectedTitle,"Right title");
		boolean result = actualTitle.equals(expectedTitle);
		Assert.assertTrue(result, "Right Title");
		//soft.assertFalse(result, "Wrong Title");
	}
	@Test
	public void verifyloginPage2() throws InterruptedException
	{
		System.out.println("test4");
		//String actualTitle = driver.getTitle();
		Thread.sleep(2000);
		
		boolean result1 = actualTitle.equals(expectedTitle);
		System.out.println(result1);
	//Assert.fail();
	if(result1 == true)
		{
		System.out.println("TRUE");
		//Assert.fail();
		}
    }

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
		
	}
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		System.out.println("AfterClass");
		driver.quit();
		Thread.sleep(2000);
	}
	



}
