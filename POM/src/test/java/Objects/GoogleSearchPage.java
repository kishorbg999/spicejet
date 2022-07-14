package Objects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By searchbox=By.xpath("//*[@name='q']");
	By searchclick=By.xpath("(//input[@name='btnK'])[1]");
	
	public void searchGoogle(String searchinput)
	{
		driver.findElement(searchbox).sendKeys(searchinput);
		
		driver.findElement(searchclick).click();
	}

}
