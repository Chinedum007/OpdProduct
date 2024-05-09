package scripts;

import org.testng.annotations.Test;

import pages.CheckAvailability;

public class TC005 extends BaseTest{
	
	@Test(description="As an admin I want to be able to check rooms available for booking")
	
	public void CheckAvailableRooms() throws InterruptedException {
		
		CheckAvailability ca= new CheckAvailability(driver, webActionUtil);
		ca.Check4Availability();
		
	}

}
