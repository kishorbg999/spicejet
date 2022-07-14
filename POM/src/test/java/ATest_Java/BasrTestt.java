package ATest_Java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Amain_Java.AdminPagee;
import Amain_Java.BaseClasss;
import Amain_Java.DashboardPageee;
import Amain_Java.LoginPageee;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasrTestt extends BaseClasss {

	@BeforeSuite
	public void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void allObjects() {
		LoginPag = new LoginPageee(driver);
		DashboardP = new DashboardPageee(driver);
		Admibp = new AdminPagee(driver);
	}

	@AfterSuite
	public void tearDown() {
		// driver.quit();
	}

}
