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
import W3TestPack.W3schoolHome;

public class TestClass {
	private WebDriver driver;
	private W3schoolHome w3schoolHome;
	@BeforeClass
	public void beforeClass() throws InterruptedException
    {
		System.out.println("BeforeClass");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishna\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("BeforeMethod");
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		W3schoolHome w3schoolHome = new W3schoolHome(driver);
		w3schoolHome.clickOntutorials();
		
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		System.out.println("BeforeMethod");
		/*driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		W3schoolHome w3schoolHome = new W3schoolHome(driver);
		w3schoolHome.clickOntutorials(); */
	 }
	@Test
	public void test1()
	{
		System.out.println("test1");
		String actualTitle = driver.getTitle();
		String actualurl = driver.getCurrentUrl();
		String expectedTitle = "W3Schools Online Web Tutorials";
		String expectedUrl="https://www.w3schools.com/";
		if (actualTitle.equals(expectedTitle) && actualurl.equals(expectedUrl))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	/*@ Test
	public void Test2()
	{
		w3schoolHome.clickOntutorials();
		w3schoolHome.clickOnlearnJava();
		w3schoolHome.clickOnstartLearningJavaNow();
		w3schoolHome.clickOnNext();
	}
	*/
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



