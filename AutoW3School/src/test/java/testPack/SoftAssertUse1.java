package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import W3TestPack.W3LoginPage;

public class SoftAssertUse1 {
	private WebDriver driver;
	String actualTitle;
	String expectedTitle;
	@BeforeClass
	public void beforeClass()
    {
		System.out.println("BeforeClass");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishna\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		System.out.println("BeforeMethod");
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		W3LoginPage w3loginPage= new W3LoginPage(driver);
		w3loginPage.clickOnlogin();
		w3loginPage.clickOnsignUp();
	 }
	@Test
	public void verifyloginPage()
	{
		System.out.println("test2");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in - W3Schools";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle,  expectedTitle, "Wrong Title");
		boolean result = actualTitle.equals(expectedTitle);
		soft.assertTrue(result, "Right Title");
		soft.assertAll();
	}
	@Test
	public void verifyloginPage1()
	{
		System.out.println("test3");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in - W3Schools1";
		SoftAssert soft = new SoftAssert();
		soft.assertNotEquals(actualTitle,  expectedTitle,"Right title");
		boolean result = actualTitle.equals(expectedTitle);
		soft.assertFalse(result, "Wrong Title");
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
