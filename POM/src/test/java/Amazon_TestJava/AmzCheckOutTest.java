package Amazon_TestJava;

import org.testng.annotations.Test;

public class AmzCheckOutTest extends AmzBaseTest {
	
	@Test
	public void checkoutpageAmz()
	{
		checkoutpage.proceedtocheckout();
	}

}
