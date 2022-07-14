package vishaltest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import vishalmain.BaseClass;
import vishalmain.SearchPage;

public class BaseTest extends BaseClass {
	
	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	@BeforeClass
	public void allObjects()
	{
		searcht=new SearchPage(driver);
		 
		 
	}
	
//	@AfterSuite
	public void tearDown()
	{
		//driver.close();	
	}

}
