package Amazon_MainJava;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon_TestJava.AmzBaseTest;

public class AmzSearchBar extends AmzBaseTest {
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	WebElement searchbar;
	
	@FindBy(xpath="//*[@id='nav-search-submit-button']")
	WebElement searchbtn;
	
	@FindBy(xpath="//span[contains(text(),'L32M6-RA/L32M7-RA')]")
	WebElement productpageclk;
	
	

	
	public AmzSearchBar(WebDriver driver)
	{
		AmzBaseClass.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchAmz()
	{
		searchbar.click();
		searchbar.sendKeys("Redmi 80 cm");
		searchbtn.click();
		productwindow=driver.getWindowHandle();
	}
	
	public void searchbarProductPage()
	{
		productpageclk.click();
		//Assert.assertEquals("", "");
		
	}
	
	
	

}
