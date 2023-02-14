package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import W3TestPack.W3LoginPage;

public class VerifyLoginPage {

	private WebDriver driver;
	private W3LoginPage w3loginPage;
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
	 }
	@Test
	public void verifyloginPage()
	{
		System.out.println("test1");
		String actualTitle = driver.getTitle();
		String actualurl = driver.getCurrentUrl();
		String expectedTitle = "Log in - W3Schools";
		String expectedUrl="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		if (actualTitle.equals(expectedTitle) || actualurl.equals(expectedUrl))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	public void clickOnSignUp()
	{
		w3loginPage.clickOnsignUp();
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



