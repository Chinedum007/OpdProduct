package scripts;

import org.testng.annotations.Test;

import pages.RejectBookingRequest;

public class TC025 extends BaseTest{
	
	@Test(description="As an admin I would like to reject a booking request")
	
	public void rejectABookingRequest() throws InterruptedException {
		
		RejectBookingRequest rbr= new RejectBookingRequest(driver, webActionUtil);
		rbr.rejectBookingRequest();
	}

}
