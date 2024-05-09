package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class CancelBooking extends BasePage {

	public CancelBooking(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}

	@FindBy(xpath="//div[text()='Booking']")
	private WebElement bookingTab;
	
	@FindBy(xpath="//a[text()='Cancel Bookings']")
	private WebElement cancelBookingsTab;
	
	@FindBy(xpath="//button[@value='advanced']")
	private WebElement clickAdvancedButton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement selectCheckBox;
	
	@FindBy(id="cancelBookings")
	private WebElement cancelBookingsButton;
	
	@FindBy(id="CancellationReasonId")
	private WebElement cancellationReason;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement clickOk;
	
	public void CancelSingleBooking() throws InterruptedException {
		
		webActionUtil.moveToElement(bookingTab);
		Reporter.log("Hover mouse to booking Tab");
		
		webActionUtil.clickOnElement(cancelBookingsTab);
		Reporter.log("Click on cancel bookings", true);
		
		webActionUtil.clickOnElement(clickAdvancedButton);
		Reporter.log("Click on advanced search to find all Bookings", true);
		
		webActionUtil.clickOnElement(selectCheckBox);
		Reporter.log("Select the booking you want to cancel", true);
		
		webActionUtil.clickOnElement(cancelBookingsButton);
		webActionUtil.selectByTextInListBox(cancellationReason,"Bank Holiday");
		Reporter.log("Select cancellation reason", true);
		Thread.sleep(5000);
		webActionUtil.clickOnElement(submitButton);
		Reporter.log("Click on submit button to send request", true);
		Thread.sleep(5000);
		webActionUtil.clickOnElement(clickOk);
		Reporter.log("Booking cancelled successfully", true);
		
	}
	
	
}
