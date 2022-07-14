package ATest_Java;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DashboardTestttt extends BasrTestt{
	
	@Test(priority=5)
	public void dashHeaderverify()
	{
		DashboardP.verifyDashHeader("Dashboard");
	}

}
