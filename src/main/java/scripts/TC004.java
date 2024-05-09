package scripts;

import org.testng.annotations.Test;

import pages.CancelBooking;

public class TC004 extends BaseTest {
	
	@Test(description="As an Admin I want to be able to cancel a single booking")
	
	public void cancelBooking() throws InterruptedException {
		CancelBooking cb= new CancelBooking(driver, webActionUtil);
		cb.CancelSingleBooking();
		
	}

}
