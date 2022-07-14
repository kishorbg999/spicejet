package Amazon_MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon_TestJava.AmzBaseTest;

public class AmzLoginPage extends AmzBaseTest{
	
	
	@FindBy(xpath="(//*[@class='nav-line-1-container'])[1]")
	WebElement loginsignbtn;
	
	@FindBy(xpath="//*[@id='ap_email']")
	WebElement loginuname;
	
	@FindBy(xpath="//*[@class='a-button-input']")
	WebElement continuetopass;
	
	@FindBy(id="ap_password")
	WebElement loginpass;
	
	@FindBy(id="signInSubmit")
	WebElement signinbtn;
	
	public AmzLoginPage(WebDriver driver)
	{
		AmzBaseClass.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void signIn()
	{
		
				
		loginsignbtn.click();
		loginuname.sendKeys("9096713846");
		continuetopass.click();
		loginpass.sendKeys("9096713846");
		signinbtn.click();
		
	}
 
	

}
