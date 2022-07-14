package TwitterTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import TwitterMain.BaseClass;
import TwitterMain.TwtHomeSearchPage;
import TwitterMain.TwtLoginPage;
import TwitterMain.TwtLogout;
import TwitterMain.TwtProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BaseClass {

	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver();

		driver.navigate().to("https://mobile.twitter.com/?logout");

		driver.manage().window().maximize();

	}

	@BeforeClass
	public void allObjects() {
		TwtLoginP = new TwtLoginPage(driver);
		TwtHomeSearchP = new TwtHomeSearchPage(driver);
		TwtProfileP=new TwtProfilePage(driver);
		logouta=new TwtLogout(driver);
	}

	// @AfterSuite
	public void tearDown() {

		driver.quit();
	}

}
