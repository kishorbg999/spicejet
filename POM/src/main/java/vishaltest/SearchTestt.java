package vishaltest;

import org.testng.annotations.Test;

public class SearchTestt extends BaseTest{
		
		@Test
		public void oneWaystatus()
		{
			searcht.deptCitySelect();
			//Thread.sleep(5000);
			searcht.arrCity();
			//Thread.sleep(5000);
			searcht.deptDate();
			//Thread.sleep(5000);
			searcht.searchBtn();
		}
		
		
		
		

	}
