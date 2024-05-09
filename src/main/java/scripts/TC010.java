package scripts;

import org.testng.annotations.Test;

import pages.ReportForActivityBySpeciality;

public class TC010 extends BaseTest {
	
	@Test(description="As an Admin I want to be able to view Report 0n Activity By Speciality")
	
	public void viewActivityBySpecialityReport() throws InterruptedException {
		
		ReportForActivityBySpeciality ras= new ReportForActivityBySpeciality(driver, webActionUtil);
		ras.activityBySpecialityReport();
	}

}
