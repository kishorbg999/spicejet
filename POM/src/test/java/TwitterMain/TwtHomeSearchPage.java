package TwitterMain;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TwitterTest.BaseTest;

public class TwtHomeSearchPage extends BaseTest {

	@FindBy(xpath = "//*[@placeholder='Search Twitter']")
	WebElement searchBar;

	@FindBy(xpath = "//a[@href='/elonmusk']")
	WebElement elonMuskProfile;
	
	@FindBy(xpath="//*[text()='Who to follow']")
	WebElement scrollwhotofollow;

	public TwtHomeSearchPage(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void findElonMuskProfile() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		searchBar.click();
		searchBar.sendKeys("Elon Musk");
		searchBar.submit();
		elonMuskProfile.click();
	}
	public void scrollCheck()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		//js.executeScript("arguments[0].scrollIntoView();", move);
		//js.executeScript("arguments[0].scrollIntoView();",scrollwhotofollow);
		
		
	}

}
