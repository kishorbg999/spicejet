package Amazon_TestJava;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Amazon_MainJava.AmzBaseClass;
import Amazon_MainJava.AmzCheckOutPage;
import Amazon_MainJava.AmzLoginPage;
import Amazon_MainJava.AmzPaymentPage;
import Amazon_MainJava.AmzProductPage;
import Amazon_MainJava.AmzSearchBar;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmzBaseTest extends AmzBaseClass{

	

	@BeforeSuite
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		parenthomewindow=driver.getWindowHandle();
	}
	
	@BeforeClass
	public void allObjects()
	{
		loginpage=new AmzLoginPage(driver);
		 searchbar=new AmzSearchBar(driver);
		 productpage=new AmzProductPage(driver);
		 checkoutpage=new AmzCheckOutPage(driver);
		 paymentpage=new AmzPaymentPage(driver);
		 
	}
	
//	@AfterSuite
	public void tearDown()
	{
		//driver.close();	
	}

}
