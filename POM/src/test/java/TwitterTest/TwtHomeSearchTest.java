package TwitterTest;

import org.testng.annotations.Test;


public class TwtHomeSearchTest extends BaseTest{
	
	@Test(priority=11)
	public void elonProfileSearch()
	{
		//TwtHomeSearchP.scrollCheck();
		TwtHomeSearchP.findElonMuskProfile();
	}

}
