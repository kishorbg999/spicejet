import java.sql.DriverAction;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowids {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@href='http://www.orangehrm.com']")).click();
		
		Set<String> all = driver.getWindowHandles();
		
		ArrayList<String> list = new ArrayList<String>(all);
		
		/*String firstw = list.get(0);
		
		String secondw = list.get(1);
		
		System.out.println(firstw);
		System.out.println(secondw);
		*/
	for(String one:list)		
	{
		String title = driver.switchTo().window(one).getTitle();
		System.out.println(title);
	}
		
		
	}

}
