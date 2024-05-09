package scripts;

import org.testng.annotations.Test;

import pages.ReportForActivityByClinicCode;

public class TC009 extends BaseTest {
	
	@Test(description="As an Admin I want to be able to view report for Activity by clinic code")
	
	public void viewActivityByClinicCodeReport() {
		ReportForActivityByClinicCode rac= new ReportForActivityByClinicCode(driver, webActionUtil);
		rac.activityByClinicCodeReport();
	
	}
	
	
}
