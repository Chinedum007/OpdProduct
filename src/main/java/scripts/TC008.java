package scripts;

import org.testng.annotations.Test;

import pages.searchBookings;

public class TC008 extends BaseTest{
	
	@Test(description="As an admin I want to be able to search for all bookings ")
	
	public void search4AllBookings() throws InterruptedException {
		searchBookings sb= new searchBookings(driver, webActionUtil);
        sb.searchForAllBookings();	
        
	}

}
