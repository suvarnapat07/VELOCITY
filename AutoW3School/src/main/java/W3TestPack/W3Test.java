package W3TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import testpack.W3schoolHome;

public class W3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishna\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		W3schoolHome w3schoolHome = new W3schoolHome(driver);
		w3schoolHome.clickOntutorials();
		
		w3schoolHome.clickOnlearnJava();
		w3schoolHome. clickOnstartLearningJavaNow();
		w3schoolHome.clickOnNext();
		
	}

}
