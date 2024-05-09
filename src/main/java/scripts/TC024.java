package scripts;

import org.testng.annotations.Test;

import pages.BookingRequestViaNotices;

public class TC024 extends BaseTest{
	
	@Test(description="As an admin I wouldlike to confirm booking from booking request")
	
	public void ConfirmBookingFromBookingRequest() throws InterruptedException {
		BookingRequestViaNotices Brn= new BookingRequestViaNotices(driver, webActionUtil);
		Brn.MakeBookingViaBookingRequest();
	}

}
