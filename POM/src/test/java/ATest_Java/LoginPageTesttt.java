package ATest_Java;

import org.testng.annotations.Test;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTesttt extends BasrTestt{
	
	@Test
	public void loginTitle()
	{
		LoginPag.verifyLoginPAgeTitle("OrangeHRM");
	}
	
	@Test
	public void loginUrlVerify()
	{
		LoginPag.verifyLoginPageUrl("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=1)
	@Parameters({"validuname","validpass"})
	public void loginVerify(@Optional("Admin")String vuname, @Optional("admin123")String vpass)
	{
		LoginPag.verifyLogin(vuname, vpass);
	}

}
