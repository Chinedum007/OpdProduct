package scripts;

import org.testng.annotations.Test;

import pages.ReportForBookingPreventions;

public class TC015 extends BaseTest{
	
	@Test(description="As an admin I want to view report for booking preventions")
	
	public void bookingPreventionReport() throws InterruptedException {
		ReportForBookingPreventions rbp= new ReportForBookingPreventions(driver, webActionUtil);
		rbp.viewBookingsPreventionsReport();
	}

}
