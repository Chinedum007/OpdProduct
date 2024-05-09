package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class ReportForAdvancedClinic extends BasePage{

	public ReportForAdvancedClinic(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement ReportsTab;
	
	@FindBy(xpath="//a[text()='Advanced Clinic']")
	private WebElement advanceClinicTab;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickOnSearchBtn;
	 
	public void advancedClinicReport() throws InterruptedException {
		webActionUtil.moveToElement(ReportsTab);
		Reporter.log("Hover mouse to Reports tab and click on it", true);
		
		webActionUtil.clickOnElement(advanceClinicTab);
		Reporter.log("Click on the advanced clinic tab to open", true);
		
		webActionUtil.clickOnElement(clickOnSearchBtn);
		Reporter.log("Click on the search button to display report", true);
		
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 200);");
		Reporter.log("Scroll down!to view more data on the report",true);
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0, -200);");
		Reporter.log("Scroll up!", true);
		Thread.sleep(2000);
	}
	
}
