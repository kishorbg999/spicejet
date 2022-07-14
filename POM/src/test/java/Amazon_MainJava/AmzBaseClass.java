package Amazon_MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AmzBaseClass {
	
	protected static WebDriver driver;
	protected AmzLoginPage loginpage;
	protected AmzSearchBar searchbar;
	
	protected WebDriverWait wait;
	protected String parenthomewindow;
	protected String productwindow;
	
	protected AmzProductPage productpage;
	protected AmzCheckOutPage checkoutpage;
	protected AmzPaymentPage paymentpage;
	

}
