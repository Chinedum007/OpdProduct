package scripts;

import org.testng.annotations.Test;

import pages.ReportForActivityByClinicLead;

public class TC013 extends BaseTest{
	
	@Test(description="As an admin I would like to view and print Activity By Clinic Report")
	
	public void ViewAndPrintActivityByClinicReport() throws InterruptedException {
		ReportForActivityByClinicLead abl = new ReportForActivityByClinicLead(driver, webActionUtil);
		abl.ActivityByClinicLeadReport();
	}

}
