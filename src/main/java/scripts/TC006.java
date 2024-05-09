package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.NewBookingPrevention;

public class TC006 extends BaseTest{

	@Test(description="As an admin I want to be able to prevent a booking on a room")
	
	public void BookingPrevention() throws InterruptedException {
		NewBookingPrevention nbp =new NewBookingPrevention(driver, webActionUtil);
		nbp.PreventBooking();
		Reporter.log("Booking prevention created for room name= Area C1 on the 7th of Mar 2022", true);
	}
}
