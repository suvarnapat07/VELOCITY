package W3TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialsPage {
@FindBy(xpath ="//a[@title='Tutorials']")
private WebElement tutorials;
@FindBy(xpath = "//h3[text()='HTML and CSS']")
private WebElement learnHtml;
@FindBy(xpath = "//a[text()='Learn C']")
private WebElement learnC;
@FindBy(xpath = "//a[text()='Learn Git']")
private WebElement learnGit;
@FindBy(xpath="//a[text()='Learn Excel'][1]")
private WebElement learnExcel;
public TutorialsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickOnTutorials()
{
	tutorials.click();
}
public void clickOnLearnHtml()
{
	learnHtml.click();
}
public void clickOnLearnC()
{
	learnC.click();
}
public void clickOnLearnGit()
{
	learnGit.click();
}
public void clickOnLearnExcel()
{
	learnExcel.click();
}
}
