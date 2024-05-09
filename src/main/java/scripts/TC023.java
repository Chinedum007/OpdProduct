package scripts;

import org.testng.annotations.Test;

import pages.DeleteCancellationReasons;

public class TC023 extends BaseTest {
	
	@Test(description="As an admin I would like to delete reason for cancellation")
	
	public void deleteAReasonForCancellation() throws InterruptedException {
		DeleteCancellationReasons dcr= new DeleteCancellationReasons(driver, webActionUtil);
		dcr.deleteCancellationReasons();
	}

}
