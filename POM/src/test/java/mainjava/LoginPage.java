package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testjava.BaseTest;

public class LoginPage extends BaseTest {
	
	//All Locators

	@FindBy(id = "txtUsername")
	WebElement uname;

	@FindBy(id = "txtPassword")
	WebElement pass;

	@FindBy(how = How.ID, using = "btnLogin")
	WebElement btnlogin;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle(String ExpTitleLoginPAge)
	{
		String actTitleLoginPage=driver.getTitle();
		Assert.assertEquals("Title Not Matching LoginPage", ExpTitleLoginPAge, actTitleLoginPage);
		
		return actTitleLoginPage;
		
	}
	
	public String verifyUrlLoginPage(String expUrlLoginPage)
	{
		String actUrlLoginPage=driver.getCurrentUrl();  
		
		Assert.assertEquals("Url not Matched Lgin Page", expUrlLoginPage, actUrlLoginPage);
		
		return actUrlLoginPage;
	}
	
	public void verifyLoginwithCorrectCredential()
	{
		uname.sendKeys("Admin");
		pass.sendKeys("admin123");
		btnlogin.click();
	}

}
