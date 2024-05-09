package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class CheckAvailability extends BasePage{

	public CheckAvailability(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
	
	@FindBy(xpath="//div[text()='Booking']")
	private WebElement bookingTab;
	
	@FindBy(xpath="//a[text()='Check Availability']")
	private WebElement checkAvailabilityTab;
	
	@FindBy(id="NextAvailable")
	private WebElement tickNextAvailable;
	
	@FindBy(id="TimeSlot_PeriodTypeId")
	private WebElement selectPeriod;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement clickSearchBtn;
	
	public void Check4Availability() throws InterruptedException {
		
		webActionUtil.moveToElement(bookingTab);
		Reporter.log("Hover mouse to booking Tab", true);
		
		webActionUtil.clickOnElement(checkAvailabilityTab);
		Reporter.log("Click on check availability", true);
		
		webActionUtil.clickOnElement(tickNextAvailable);
		webActionUtil.selectByTextInListBox(selectPeriod, "All Day");
		Reporter.log("Select your period", true);
		
		webActionUtil.clickOnElement(clickSearchBtn);
		Thread.sleep(10000);
		Reporter.log("Wait for system to display result", true);
		
	}

}
