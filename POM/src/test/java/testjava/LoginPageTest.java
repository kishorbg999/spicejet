package testjava;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import mainjava.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void verifyTitleOfLogin()
	{
		loginpage.verifyPageTitle("OrangeHRM");
		
		
	}
	
	@Test
	public void verifyUrlOfLogin()
	{
		loginpage.verifyUrlLoginPage("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=3)
	public void verifyLoginCorrectCred()
	{
		loginpage.verifyLoginwithCorrectCredential();
	}

}
