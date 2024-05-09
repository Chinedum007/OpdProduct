package scripts;

import org.testng.annotations.Test;

import pages.DeleteMultipleBooking;

public class TC011 extends BaseTest{
	
	@Test(description="As an Admin I want to be able to delete multiple bookings")
	
	public void deleteAllMultipleBookings() throws InterruptedException {
		DeleteMultipleBooking dmb= new DeleteMultipleBooking(driver, webActionUtil);
		dmb.DeleteAllBookingsInSeries();
	}

}
