package Amazon_TestJava;

import org.testng.annotations.Test;


public class AmzLoginTest extends AmzBaseTest {
	
	@Test
	public void amzlogin()
	{
		loginpage.signIn();
	}

}
