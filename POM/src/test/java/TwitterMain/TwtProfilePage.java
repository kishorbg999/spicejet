package TwitterMain;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TwitterTest.BaseTest;


public class TwtProfilePage extends BaseTest {
	
	@FindBy(xpath="//span[text()='Profile']")
	WebElement profiletab;
	
	@FindBy(xpath="//span[text()='Edit profile']")
	WebElement editProfile;
	
	@FindBy(xpath="//*[@name='displayName']")
	WebElement displayName;
	
	@FindBy(xpath="//*[text()='Save']")
	WebElement saveBtnProfilePage;
	
	@FindBy(xpath="//*[@name='description']")
	WebElement editBioProfilePage;

	
	public TwtProfilePage(WebDriver driver)
	{
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openProfilePage()
	{
		profiletab.click();
	}
	
	public void verifyProfileUrl(String exptitle)
	{
	String profileUrl=driver.getCurrentUrl();
	Assert.assertEquals(exptitle, profileUrl);
	}
	
	public void profileEdit()
	{
		editProfile.click();
		
	}
	public void profileEditName(String editname)
	{
		displayName.click();
		displayName.clear();
		displayName.sendKeys(editname);
	}
	
	public void profileEditBio(String editbio)
	{
		editBioProfilePage.click();
		editBioProfilePage.sendKeys(editbio);
	}
	
	public void profileSaveBtn()
	{
		saveBtnProfilePage.click();
	}
	

}
