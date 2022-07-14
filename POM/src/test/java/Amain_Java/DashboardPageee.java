package Amain_Java;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import ATest_Java.BasrTestt;

public class DashboardPageee extends BasrTestt {

	// All Locators

	@FindBy(xpath = "//*[@class='head']//h1")
	WebElement header;

	@FindBy(id = "//*[text()='Logout']")
	WebElement logout;

	public DashboardPageee(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void logout() {
		header.click();
		logout.click();
		Reporter.log("Logged Out Successfully", true);
	}

	public void verifyDashHeader(String expHeader) {
		String dashHreader = header.getText();

		Assert.assertEquals("", expHeader, dashHreader);
		Reporter.log("Verified Header Dashboard", true);

	}

}
