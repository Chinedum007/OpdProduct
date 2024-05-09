package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class ReportForActivityBySpeciality extends BasePage {

	public ReportForActivityBySpeciality(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement ReportsTab;
	
	@FindBy(xpath="//a[text()='Activity By Speciality']")
	private WebElement activityBySpecialityTab;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickOnSearchBtn;
	
	@FindBy(xpath="//span[@id='print-icon']")
	private WebElement clickOnPrintBtn;
	
	public void activityBySpecialityReport() throws InterruptedException {
		webActionUtil.moveToElement(ReportsTab);
		Reporter.log("Hover mouse to Reports tab and click on it", true);
		
		webActionUtil.clickOnElement(activityBySpecialityTab);
		Reporter.log("Click on the activity by clinic code tab to open", true);
		
		webActionUtil.clickOnElement(clickOnSearchBtn);
		Reporter.log("Click on the search button to display report", true);
		Thread.sleep(3000);
		 webActionUtil.clickOnElement(clickOnPrintBtn);
		 Reporter.log("Wait for excel to open sheet with data info");
		 Thread.sleep(10000);
	}
}
