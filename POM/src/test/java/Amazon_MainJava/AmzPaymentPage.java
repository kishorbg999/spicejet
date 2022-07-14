package Amazon_MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon_TestJava.AmzBaseTest;

public class AmzPaymentPage extends AmzBaseTest {
	
	@FindBy(xpath="//input[@class=\"a-button-text\" and @value='Continue']")
	WebElement continuetopaymentpage;
	
	public AmzPaymentPage(WebDriver driver) {
		
		AmzBaseClass.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void paymentPageAmz()
	{
		continuetopaymentpage.click();
	}

}
