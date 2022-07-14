

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Adblock1 {
	
			public static void main(String[] args) throws InterruptedException
		{
			
				System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
				ChromeOptions options = new ChromeOptions();
				options.addExtensions(new File("C:\\selenium\\ublock.crx")); 
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				options.merge(capabilities);
				WebDriver driver = new ChromeDriver(options);
				
								
				driver.get("https://www.sarkariresult.com/bihar/bihar-police-bpssc-si-03-2020/");
				//driver.manage().window().maximize();
				
		}
			
}


