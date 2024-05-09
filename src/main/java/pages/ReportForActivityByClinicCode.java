package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class ReportForActivityByClinicCode extends BasePage {

	public ReportForActivityByClinicCode(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement ReportsTab;
	
	@FindBy(xpath="//a[text()='Activity By Clinic Code']")
	private WebElement activityByClinicCodeTab;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickOnSearchBtn;
	
	public void activityByClinicCodeReport() {
		webActionUtil.moveToElement(ReportsTab);
		Reporter.log("Hover mouse to Reports tab and click on it", true);
		
		webActionUtil.clickOnElement(activityByClinicCodeTab);
		Reporter.log("Click on the activity by clinic code tab to open", true);
		
		webActionUtil.clickOnElement(clickOnSearchBtn);
		Reporter.log("Click on the search button to display report", true);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 700);");
		Reporter.log("Scroll down!to view more data on the report",true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jse.executeScript("window.scrollBy(0, -700);");
		Reporter.log("Scroll up!", true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
