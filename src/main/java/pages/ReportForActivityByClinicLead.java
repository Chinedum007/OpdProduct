package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class ReportForActivityByClinicLead extends BasePage{

	public ReportForActivityByClinicLead(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);		
	}

	@FindBy(xpath="//div[text()='Reports']")
	private WebElement ReportsTab;
	
	@FindBy(xpath="//a[text()='Activity By Clinic Lead']")
	private WebElement clinicLeadTab;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickOnSearchBtn;
	
	@FindBy(xpath="//span[@id='print-icon']")
	private WebElement PrintBtn;
	
	public void ActivityByClinicLeadReport() throws InterruptedException {
		webActionUtil.moveToElement(ReportsTab);
		Reporter.log("Hover mouse to Reports tab and click on it", true);
		
		webActionUtil.clickOnElement(clinicLeadTab);
		Reporter.log("Click on the activity by clinic lead tab to open", true);
		
		webActionUtil.clickOnElement(clickOnSearchBtn);
		Reporter.log("Click on the search button to display report", true);
		
		Thread.sleep(3000);
		 webActionUtil.clickOnElement(PrintBtn);
		 Reporter.log("Click on print button to download report", true);
		 Thread.sleep(10000);
	}
}
