package testjava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.DashboardPage;
import mainjava.LoginPage;

public class BaseTest extends BaseClass {

	@BeforeSuite
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void pageObjects()
	{
		loginpage=new LoginPage(driver);
		DashboardP=new DashboardPage(driver);
		
		
	}

	
	public void tearDown() {
		
		//driver.close();
	}

}
