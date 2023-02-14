package testPack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		//TakesScreenshot screenshot = ((TakesScreenshot)driver);
		WebElement section = driver.findElement(By.xpath("//input[@id='search2']"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Krishna\\Pictures\\Screenshots\\Image2.jpeg");
		////input[@id='search2']
		FileUtils.copyFile(src ,dest);

	}

}
