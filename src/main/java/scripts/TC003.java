package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.AddBooking;

public class TC003 extends BaseTest{
	
	@Test(description="As an Admin I want to create a single booking")
	
	public void addSingleBooking() throws InterruptedException {
	
		AddBooking ab= new AddBooking(driver, webActionUtil);
		ab.createSingleBooking();
		Reporter.log("Single booking Created", true);
	}
	
	

}
