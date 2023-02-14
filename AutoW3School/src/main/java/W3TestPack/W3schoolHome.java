package W3TestPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3schoolHome
{
	@FindBy(xpath="//a[@title='Tutorials']")
	private WebElement tutorials;
	@FindBy(xpath="//a[text()='Learn Java'][1]")
	private WebElement learnJava;
	@FindBy(xpath="//a[text()='Start learning Java now »']")
	private WebElement startLearningJavaNow;
	@FindBy(xpath="//a[@class='w3-right w3-btn']")
	private WebElement  next;
	
	public W3schoolHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOntutorials()
	{
		tutorials.click();
	}
	public void clickOnlearnJava()
	{
		learnJava.click();
	}
	public void clickOnstartLearningJavaNow()
	{
		startLearningJavaNow.click();
	}
	public void clickOnNext()
	{
		next.click();
	}
}

	


