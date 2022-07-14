package TwitterMain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TwitterTest.BaseTest;

public class TwtLoginPage extends BaseTest {

	@FindBy(xpath = "//*[text()='Sign in']")
	WebElement btnSignIn;

	@FindBy(xpath = "//*[@autocomplete='username']")
	WebElement loginUnameTxt;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement loginNxtBtn;

	@FindBy(xpath = "//*[@type=\"password\"]")
	WebElement loginPassTxt;

	@FindBy(xpath = "//*[text()='Log in']")
	WebElement loginSignInBtn;

	public TwtLoginPage(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void twitterLogin() {

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		btnSignIn.click();
		loginUnameTxt.click();
		loginUnameTxt.sendKeys("KrrisshT");
		loginNxtBtn.click();
		loginPassTxt.sendKeys("Krrissh@123");
		loginSignInBtn.click();

	}

}
