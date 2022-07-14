package ATest_Java;

import org.testng.annotations.Test;

public class AdminTesttt extends BasrTestt {


	@Test(priority=10)
	public void clickOnAdmin() {
		
		Admibp.adminpageclick();

	}
	
	@Test(priority=11)
	public void hoverToJob()
	{
		Admibp.verifyHovertoAdmin();
	}

}
