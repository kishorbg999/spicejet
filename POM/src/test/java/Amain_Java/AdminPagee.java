package Amain_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ATest_Java.BasrTestt;

public class AdminPagee extends BasrTestt {
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminbtn;
	
	@FindBy(xpath="//*[@id='menu_admin_Job']")
	WebElement jobhover;
	
	public AdminPagee(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void adminpageclick()
	{
		adminbtn.click();
	}
	
	public void verifyHovertoAdmin()
	{
		Actions act=new Actions(driver);
		
		act.moveToElement(adminbtn).moveToElement(jobhover).perform();
	}

}
