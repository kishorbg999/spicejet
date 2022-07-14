package Amazon_TestJava;

import org.testng.annotations.Test;

public class AmzSearchBarTest extends AmzBaseTest {
	
	@Test
	public void searchAmzTerm()
	{
		searchbar.searchAmz();
		searchbar.searchbarProductPage();
		
	}

}
