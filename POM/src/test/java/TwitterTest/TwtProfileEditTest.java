package TwitterTest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TwtProfileEditTest extends BaseTest {
	
	@Test(priority=21)
	@Parameters({"profile name"})
	public void editDisplayName(@Optional("KrrisshOptional")String pname)
	{
		TwtProfileP.openProfilePage();
		TwtProfileP.profileEdit();
		TwtProfileP.profileEditName(pname);
		TwtProfileP.profileSaveBtn();
	}
	@Test(priority=22)
	@Parameters({"Edit Bio"})
	public void editBio(String bioedit)
	{
		TwtProfileP.openProfilePage();
		TwtProfileP.profileEdit();
		TwtProfileP.profileEditBio(bioedit);
		TwtProfileP.profileSaveBtn();
		
	}

}
