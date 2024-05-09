package scripts;

import org.testng.annotations.Test;

import pages.EditCancellationReasons;

public class TC022 extends BaseTest {
	
	@Test(description="As and admin I would like to edit reason for cancellation")
	
	public void EditAReasonForCancellation() throws InterruptedException {
		EditCancellationReasons ecr = new EditCancellationReasons(driver, webActionUtil);
		ecr.editCancelationReasons();
	}

}
