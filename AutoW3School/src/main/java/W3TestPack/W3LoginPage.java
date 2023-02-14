package W3TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3LoginPage {
	@FindBy(xpath = "//a[@id='w3loginbtn']")
	private WebElement login;
	@FindBy(xpath ="//span[text()=' Sign up']")
	private WebElement signUp;
	@FindBy(xpath ="//input[@name='email']")
	private WebElement email;
	@FindBy(xpath ="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath ="//span[text()='Sign up for free']")
	private WebElement signUpForFree;
	@FindBy(xpath ="//input[@name='first_name']")
	private WebElement firstName;
	@FindBy(xpath ="//input[@name='last_name']")
	private WebElement lastName;
	@FindBy(xpath ="//span[text()='Continue']")
	private WebElement continueLogin;
	public W3LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnlogin()
	{
		login.click();
	}
	public void clickOnsignUp()
	{
		signUp.click();
	}
	public void sendEmail()
	{
		email.sendKeys("ufss@yahoo.com");
	}
	public void sendPassword()
	{
		password.sendKeys("A21#897");
	}
	public void clickOnsignUpForFree()
	{
		signUpForFree.click();
	}
	public void sendFirstName()
	{
		firstName.sendKeys("vuvdi");
	}
	public void sendLastName()
	{
		lastName.sendKeys("ruycl");
	}
	public void clickOnContinuelogin()
	{
		continueLogin.click();
	}
}
