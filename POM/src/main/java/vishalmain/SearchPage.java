package vishalmain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchPage extends BaseClass {

	//String date = "14";
	//String month = "October";
	//String year1 = "2022";

	//String datepath = "//*[@data-testid='undefined-month-"+ month+"-"+year1+"']//div[contains(text(),'"+date+"')]";

	String clkarr="(//*[@data-testid='to-testID-destination'])//input";
	String citlst="//*[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']";
	
	String cityname="//*[@data-testid='to-testID-origin']//following::div[contains(text(),'Agra')]";
	
	
	@FindBy(xpath = "//*[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")
	List<WebElement> citlst1;
	
	@FindBy(xpath="//*[@class=\"css-1dbjc4n r-1ewfge1 r-ms8t9i r-1phboty r-1loqt21 r-p1pxzi r-lqms97 r-1qhn6m8 r-1otgn73\"]")
	WebElement international;
	
	@FindBy(xpath="//*[@class=\"r-1862ga2 r-1loqt21 r-1i10wst r-tceitz r-u8s1d css-76zvg2\"]")
	WebElement cityclickdirect;
	
	@FindBy(xpath = "(//*[@data-testid='to-testID-destination'])//input")
	WebElement clkarr1;
	
	@FindBy(xpath = "(//*[@class='css-1dbjc4n r-zso239'])[1]")
	WebElement oneWayrdo;

	@FindBy(xpath = "//*[@data-testid='to-testID-origin']")
	WebElement deptCity;

	@FindBy(xpath = "//*[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")
	List<WebElement> cityList;

	@FindBy(xpath = "(//*[@data-testid='to-testID-destination'])//input")
	WebElement citylistclick;
	
	@FindBy(xpath="//*[@class=\"css-1dbjc4n r-1yflyrw\"]//div")
	WebElement verifycitytext;

	@FindBy(xpath = "//*[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")
	List<WebElement> arrcityList;

	@FindBy(xpath = "//*[contains(text(),\"Departure Date\")]")
	WebElement deptdateclk;

	@FindBy(xpath = "//*[@data-testid='home-page-flight-cta']")
	WebElement searchbtnn;

	public SearchPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void oneWayRadioIsSelected() {
		boolean actual = oneWayrdo.isSelected();

		SoftAssert sf = new SoftAssert();

		sf.assertEquals(actual, true);

		Reporter.log("Radiobtn is Selected", true);
		sf.assertAll();
	}

	public void deptCitySelect() {
		
		deptCity.click();

		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(deptCity));
		for (WebElement city : cityList) {
			
			if (city.getText().equalsIgnoreCase("Agra"))
				
				city.click();
			
		}
		//Assert.assertTrue(true, "dep City Selected");

	}

	public void arrCity() {
		
		cityclickdirect.click();
		
		//cityclickdirect.click();
		
		driver.findElement(By.xpath(clkarr)).click();
		//List<WebElement> cityList = driver.findElements(By.xpath(citlst));

		for (WebElement city3 : citlst1) {
			try
			{
			if (city3.getText().equalsIgnoreCase("Barca Airport"))
				city3.click();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		//Assert.assertTrue(true, "Arr City Selected");
	}

	public void deptDate() {

		//deptdateclk.click();
		String date = "14";
		String month = "October";
		String year1 = "2022";

		driver.findElement(By.xpath("//*[@data-testid='undefined-month-"+month+"-"+year1+"']//div[contains(text(),'"+date+"')]")).click();

		//Assert.assertTrue(true, "Date dep Selected");

	}

	public void returnBox() {
		boolean rBox = driver.findElement(By.xpath("//*[contains(text(),'Return Date')]")).isEnabled();

		System.out.println(rBox);

		// Assert.assertTrue(rBox);

		/*
		 * String
		 * Opaci=driver.findElement(By.xpath("//*[contains(text(),'Return Date')]")).
		 * getAttribute("style");
		 * 
		 * if(Opaci.contains("opacity: 0.5")) { System.out.println("rBox is Disabled");
		 * } else System.out.println("rBox is Enabled");
		 */
	}

	public void roundWay() {
		WebElement onewrado = driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-zso239'])[2]"));

		onewrado.click();
		Reporter.log("Clicked on RoundWay", true);
	}

	public void returnBox1() {
		boolean rBox = driver.findElement(By.xpath("//*[contains(text(),'Return Date')]")).isEnabled();

		System.out.println(rBox);

		Assert.assertEquals(rBox, true, "Return Box is Enabled");

	}

	public void deptDate1() {
		String date = "14";
		String month = "October";
		String year1 = "2022";

		driver.findElement(By.xpath("//*[contains(text(),\"Departure Date\")]")).click();

		// driver.findElement(By.xpath("//*[@data-testid='undefined-month-October-2022']//div[contains(text(),'14')]"));
		driver.findElement(By.xpath("//*[@data-testid='undefined-month-" + month + "-" + year1
				+ "']//div[contains(text(),'" + date + "')]"));

	}

	public void returnDate() {
		String date = "18";
		String month = "October";
		String year1 = "2022";

		driver.findElement(By.xpath("//*[contains(text(),'Return Date')]")).click();

		// driver.findElement(By.xpath("//*[@data-testid='undefined-month-October-2022']//div[contains(text(),'14')]"));
		driver.findElement(By.xpath("//*[@data-testid='undefined-month-" + month + "-" + year1
				+ "']//div[contains(text(),'" + date + "')]"));

	}

	public void passengers() {
		WebElement psngr = driver.findElement(By.xpath("//*[contains(text(),'Passengers')]"));
		psngr.click();

		WebElement adultcount1 = driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-1kz6sp'])[1]//div"));
		String adultcount = adultcount1.getText();
		System.out.println(adultcount);

		WebElement psngrplus = driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']"));

		while (true) {

			if (adultcount1.getText().contains("3"))

				break;

			else

				psngrplus.click();

		}

		WebElement childcount = driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-1kz6sp'])[2]//div"));
		System.out.println(childcount);
		WebElement childplus = driver.findElement(By.xpath("//*[@data-testid='Children-testID-plus-one-cta']"));
		while (true) {

			if (childcount.getText().contains("2"))

				break;

			else

				childplus.click();

		}

	}

	public void searchBtn() {

		// driver.findElement(By.xpath("//*[@data-testid='home-page-flight-cta']")).click();
		searchbtnn.click();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

}
