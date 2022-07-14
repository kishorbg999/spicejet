package Amain_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import ATest_Java.BasrTestt;


public class LoginPageee extends BasrTestt {

	// All Locators

	@FindBy(id = "txtUsername")
	WebElement uname;

	@FindBy(id = "txtPassword")
	WebElement pass;

	@FindBy(id = "btnLogin")
	WebElement btnSubmit;

	public LoginPageee(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void verifyLoginPAgeTitle(String expTitle) {
		String actTitle = driver.getTitle();

		Assert.assertEquals(expTitle, actTitle);
		
		Reporter.log("Verifying Page Title",true);

	}
	
	public void verifyLoginPageUrl(String expUrl)
	{
		String actUrl=driver.getCurrentUrl();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("Verifying Page URL",true);
		
	}
	public void verifyLogin(String usern,String Passw)
	{
		uname.sendKeys(usern);
		pass.sendKeys(Passw);
		btnSubmit.click();
		Reporter.log("Logged In Successfully",true);
	}

}
