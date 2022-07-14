package Amazon_MainJava;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon_TestJava.AmzBaseTest;

public class AmzProductPage extends AmzBaseTest {
	
	@FindBy(xpath="//*[@id='add-to-cart-button']")
	WebElement addtocartclk;
	
	public AmzProductPage(WebDriver driver)
	{
		AmzBaseClass.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void productPageBuy()
	{
		Set<String> handls = driver.getWindowHandles();
		for(String handle:handls)
		
			driver.switchTo().window(handle);
		
		if(driver.getTitle().contains("Redmi 80 cm (32 inches) HD Ready Smart LED TV | L32M6-RA/L32M7-RA (Black) (2021 Model) | With Android 11 : Amazon.in: Electronics"))
		{
			addtocartclk.click();
		}
	
			//driver.switchTo().window(productwindow);
			
	}
	

}
