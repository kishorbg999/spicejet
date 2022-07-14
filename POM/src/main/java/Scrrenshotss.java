import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;
import vishalmain.BaseClass;

public class Scrrenshotss extends BaseClass {
	
	
	
	public void scrrenShots() throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
		
	TakesScreenshot sc=(TakesScreenshot) driver;
	
	String RS = RandomString.make(3);
	
	File fl = sc.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("./screenshotssss/"+"tips"+RS+".jpg");
	
	FileHandler.copy(fl, dest);
		
	}

}
