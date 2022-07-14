import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vishalmain.BaseClass;

@Listeners(Listners.class)
public class GoogTest extends BaseClass{
		@BeforeTest
	public void load() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

	}

	@Test
	public void test1() {
		String actual = driver.getTitle();

		Assert.assertEquals(actual, "Google");

	}

	@Test
	public void test2() {

		boolean val = driver.findElement(By.className("lnXdpd")).isDisplayed();

		Assert.assertEquals(val, true);
		System.out.println("Test 2");
	}

	@Test
	public void test3() {
		String txt = driver.findElement(By.name("btnK")).getText();
		Assert.assertEquals(txt, "Google");

		System.out.println("Test 3");
	}

	public void teardown() {
		driver.quit();
	}

}
