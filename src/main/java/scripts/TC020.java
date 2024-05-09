package scripts;

import org.testng.annotations.Test;

import pages.CreateClinicTypes;

public class TC020 extends BaseTest {
	
	@Test(description="As an admin I would like to create a clinic type")
	
	public void createAClinicType() throws InterruptedException {
		
		CreateClinicTypes cct= new CreateClinicTypes(driver, webActionUtil);
		cct.createClinicTypes();
	}

}
