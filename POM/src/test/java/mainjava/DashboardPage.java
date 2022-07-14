package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testjava.BaseTest;

public class DashboardPage extends BaseTest {
	
		
		@FindBy(xpath="//h1[text()='Dashboard']")
		WebElement dashBoardpage;
		
		@FindBy(id="welcome")
		WebElement welcomeDropDown;
		
		@FindBy(xpath="//a[text()='Logout']")
		WebElement logOutOption;
		
		public  DashboardPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}
		public String verifyPageTitle(String Expectedtitleofpage) {
			String titleofdashboard=dashBoardpage.getText();
			Assert.assertEquals(titleofdashboard, Expectedtitleofpage);
			return titleofdashboard;
			}
		
		public void VerifyWelcomeDropDown() {
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			welcomeDropDown.click();
		
			
		}
		public void VerifyLogoutFunction() {
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			logOutOption.click();
		}
		
	}
