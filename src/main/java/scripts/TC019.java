package scripts;

import org.testng.annotations.Test;

import pages.DeleteClinicTypes;

public class TC019 extends BaseTest {
	
	@Test(description="As an admin I want to be able to delete clinic types")
	
	public void deleteAClinicType() throws InterruptedException {
		DeleteClinicTypes dct= new DeleteClinicTypes(driver, webActionUtil);
		dct.deleteClinicType();
	}

}
