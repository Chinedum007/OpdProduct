package scripts;

import org.testng.annotations.Test;

import pages.AddMultipleBookings;

public class TC007 extends BaseTest {

	@Test(description="As an admin I want to be able to make multiple bookings at a time")
	
	public void MakeMultipleBookings() throws InterruptedException {
		AddMultipleBookings amb= new AddMultipleBookings(driver, webActionUtil);
		amb.CreateMultipleBookings();
	}
}
