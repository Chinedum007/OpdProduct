package scripts;

import org.testng.annotations.Test;

import pages.EditPreventionBooking;

public class TC016 extends BaseTest{
	
	@Test(description="As an admin I want to edit dates of my booking prevention")
	 
	public void updateBookingPrevention() throws InterruptedException {
		EditPreventionBooking epb= new EditPreventionBooking(driver, webActionUtil);
			
		epb.editPreventionBookings();
	}

}
