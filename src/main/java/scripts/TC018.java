package scripts;

import org.testng.annotations.Test;

import pages.AdministratorClinicType;

public class TC018 extends BaseTest {
	
	@Test(description="As an Admin I want to be able to edit clinic type")
	
	public void EditClinicType() throws InterruptedException {
		
		AdministratorClinicType act= new AdministratorClinicType(driver, webActionUtil);
		act.EditClinicType();
	}

}
