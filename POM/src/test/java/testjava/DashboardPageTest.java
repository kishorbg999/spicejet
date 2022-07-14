package testjava;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class DashboardPageTest extends BaseTest  {
		
			
		@Test(priority=5)
	public void validatWelcome() {
			DashboardP.VerifyWelcomeDropDown();
		
	        }
		@Test(priority=6)
		public void validateLogout() {
			DashboardP.VerifyLogoutFunction();
		}
	}


