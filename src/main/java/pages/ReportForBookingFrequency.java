package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class ReportForBookingFrequency extends BasePage{

	public ReportForBookingFrequency(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement ReportsTab;
	
	@FindBy(xpath="//a[text()='Booking Frequency']")
	private WebElement bookingFrequencyTab;
	
	@FindBy(xpath="//button[text()='Advanced Search']")
	private WebElement advanceSearchBtn;
	
	@FindBy(xpath="//span[@id='print-icon']")
	private WebElement PrintBtn;
	
	public void BookingFrequencyReport() throws InterruptedException {
		webActionUtil.moveToElement(ReportsTab);
		Reporter.log("Hover mouse to Reports tab and click on it", true);
		

		webActionUtil.clickOnElement(bookingFrequencyTab);
		Reporter.log("Click on the activity by clinic lead tab to open", true);
		
		webActionUtil.clickOnElement(advanceSearchBtn);
		Reporter.log("Click on the search button to display report", true);
		
		Thread.sleep(3000);
		 webActionUtil.clickOnElement(PrintBtn);
		 Reporter.log("Click on print button to download report", true);
		 Thread.sleep(10000);
		 JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 100);");
			Reporter.log("Scroll down!to view more data on the report",true);
			Thread.sleep(3000);
			
			jse.executeScript("window.scrollBy(0, 100);");
			Reporter.log("Scroll down!to view more data on the report",true);
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0, 100);");
			Reporter.log("Scroll down!to view more data on the report",true);
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0, -300);");
			Reporter.log("Scroll up!to view more data on the report",true);
			Thread.sleep(2000);
			
	}
}
