package scripts;

import org.testng.annotations.Test;

import pages.ViewWeeklyViewPage;

public class TC002 extends BaseTest{

	@Test(description="As an Admin when I would like to view the weekly view page")
	
	public void viewTheWeeklyViewPage() {
		
		ViewWeeklyViewPage vwp= new ViewWeeklyViewPage(driver, webActionUtil);
		vwp.weeklyView();
	}
}
