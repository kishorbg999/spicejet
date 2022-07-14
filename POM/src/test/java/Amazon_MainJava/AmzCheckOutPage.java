package Amazon_MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon_TestJava.AmzBaseTest;

public class AmzCheckOutPage extends AmzBaseTest {
	
	@FindBy(xpath="//*[@id='attach-sidesheet-checkout-button']")
	WebElement proceedtockout;
	
	@FindBy(xpath="(//a[contains(text(),'Deliver to this address')])[1]")
	WebElement delivertoaddr;
	
		
	public AmzCheckOutPage(WebDriver driver)
	{
		AmzBaseClass.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void proceedtocheckout()
	{
		proceedtockout.click();
		
		String checkouttitle=driver.getTitle();
		if(checkouttitle.equalsIgnoreCase("Select a delivery address"))
		{
			delivertoaddr.click();
		}
		else
		{
			loginpage.signIn();
		}
	}

}
