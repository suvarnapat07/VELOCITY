package testPack;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String timeStamp = time.toString().replace(":", "_").replace(" ", "");
		System.out.println(time);
		System.out.println(timeStamp);
		driver.get("https://www.w3schools.com/");
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Krishna\\Pictures\\Screenshots\\Image4.jpeg");
		FileUtils.copyFile(src ,dest);
		
	}

}
