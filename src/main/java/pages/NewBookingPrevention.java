package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class NewBookingPrevention extends BasePage {

	public NewBookingPrevention(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
	@FindBy(xpath="//div[text()='Booking']")
	private WebElement bookingTab;
	
	@FindBy(xpath="//a[text()='New Booking Prevention']")
	private WebElement NewBookingPreventionBtn;
	
	
	@FindBy(xpath="//a[text()='Main Outpatients']/..//span[@class='dynatree-expander']")
	private WebElement SelectRoom;
	
	@FindBy(xpath="//a[text()='Area C1']/..//span[@class='dynatree-checkbox']")
	private WebElement SelectArea;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement SelectMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement SelectYear;
	
	@FindBy(xpath="//a[text()='7']")
	private WebElement SelectDatepicker;
	
	@FindBy(xpath="//a[text()='8']")
	private WebElement SelectDatepicker2;
	
	@FindBy(id="TimeSlot_PeriodTypeId")
	private WebElement SelectPeriod;
	
	@FindBy(id="Details")
	private WebElement EnterDetails;
	
	@FindBy(id="submitButton")
	private WebElement ClickOnSave; 
	
	public void PreventBooking() throws InterruptedException {
		webActionUtil.moveToElement(bookingTab);
		Reporter.log("Hover mouse to booking tab and click on it", true);
		
		webActionUtil.clickOnElement(NewBookingPreventionBtn);
		Reporter.log("Click on new booking prevention tab to open", true);
		
		Thread.sleep(5000);
		Reporter.log("wait for page to open", true);
		
		webActionUtil.clickOnElement(SelectRoom);
		Reporter.log("Select a hospital", true);
		
		webActionUtil.clickOnElement(SelectArea);
		Reporter.log("Select a room", true);
		
		Thread.sleep(5000);
		webActionUtil.selectByTextInListBox(SelectMonth,"Mar");
		webActionUtil.selectByTextInListBox(SelectYear, "2022");
		webActionUtil.clickOnElement(SelectDatepicker);
		Thread.sleep(2000);
		webActionUtil.clickOnElement(SelectDatepicker2);
		Reporter.log("Select month, year and dates 7th and 8th", true);
		Thread.sleep(2000);
		webActionUtil.selectByTextInListBox(SelectPeriod, "All Day");
		Reporter.log("Select period", true);
		
		webActionUtil.enterData(EnterDetails, "Deep Clean");
		Reporter.log("Enter reason for room prevention", true);
		
		webActionUtil.clickOnElement(ClickOnSave);
		Reporter.log("Click on save button to save form", true);
		Thread.sleep(5000);
	}
	
	
}
