package scripts;

import org.testng.annotations.Test;

import pages.DeleteBookingPrevention;

public class TC017 extends BaseTest {
	
	@Test(description="As an admin I want to be able to delete prevention bookings")
	
	public void deletePreventionBookings() throws InterruptedException {
		
		DeleteBookingPrevention dbp= new DeleteBookingPrevention(driver, webActionUtil);
		dbp.deleteBookingPrevention();
	}

}
