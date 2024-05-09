package scripts;

import org.testng.annotations.Test;

import pages.ReportForAdvancedClinic;

public class TC012 extends BaseTest{
	
	@Test(description="As an admin I want to be able to view the Advanced Clinic Report")
 
	public void advancedClinicReport() throws InterruptedException {
		ReportForAdvancedClinic rac= new ReportForAdvancedClinic(driver, webActionUtil);
		rac.advancedClinicReport();
	}
}
