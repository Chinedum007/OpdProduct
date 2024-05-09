package scripts;

import org.testng.annotations.Test;

import pages.CreateCancellationReasonsFromAdministrator;

public class TC021 extends BaseTest{
	
	@Test(description="As an admin I want to be able to create a reason for cancellation")
	
	public void createAreasonForCancellation() throws InterruptedException {
		
		CreateCancellationReasonsFromAdministrator crc= new CreateCancellationReasonsFromAdministrator(driver, webActionUtil);
	crc.createCancellationReason();	
	}

}
