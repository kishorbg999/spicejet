package TwitterMain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testjava.BaseTest;

public class TwtLogout extends BaseTest{
	
	@FindBy(xpath="//*[@class='css-1dbjc4n r-1ny4l3l']")
	WebElement logoutbtn;
	
	@FindBy(xpath="//*[contains(text(),'Log out @')]")
	WebElement logoutalltwt;
	
	public TwtLogout(WebDriver driver)
	{
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutall()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		logoutbtn.click();
		logoutalltwt.click();
	}

}
