package scripts;

import org.testng.annotations.Test;

import pages.ReportForBookingFrequency;

public class TC014 extends BaseTest{
	
	@Test(description="As an admin I want to be able view report for Booking Frequency")
	
	public void viewReportForBookingFrequency() throws InterruptedException {
		
		ReportForBookingFrequency fbf= new ReportForBookingFrequency(driver, webActionUtil);
		fbf.BookingFrequencyReport();
	}

}
