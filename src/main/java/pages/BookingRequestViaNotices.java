package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.WebActionUtil;

public class BookingRequestViaNotices extends BasePage {

	public BookingRequestViaNotices(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}

	@FindBy(xpath="//a[@href='/OPDSitesv2_7_Period/Notice/Search']")
	private WebElement ClickOnNotices;
	
	@FindBy(xpath="//a[text()='Make booking']")
	private WebElement ClickOnMakeBooking;
	
	@FindBy(xpath="//input[@data-val-number='The field FollowUpPatients must be a number.']")
	private WebElement enterFollowUpPatients;
	
	@FindBy(xpath="//input[@data-val-number='The field FollowUpPatientsVirtual must be a number.']")
	private WebElement enterFollowUpPatientsVirtual;
	
	@FindBy(id="saveBooking")
	private WebElement clickToSaveBooking;
	
	@FindBy(xpath="/html/body/div[3]/div[3]/div/button[2]")
	private WebElement ClickOnDontSendBtn;
	
	public void MakeBookingViaBookingRequest() throws InterruptedException {
		webActionUtil.clickOnElement(ClickOnNotices);
		webActionUtil.clickOnElement(ClickOnMakeBooking);
		Thread.sleep(2000);
		//webActionUtil.clickOnElement(enterFollowUpPatients);
		webActionUtil.enterData(enterFollowUpPatients, "1");
		webActionUtil.enterData(enterFollowUpPatientsVirtual, "1");
		webActionUtil.clickOnElement(clickToSaveBooking);
		Thread.sleep(3000);
		webActionUtil.clickOnElement(ClickOnDontSendBtn);
		Thread.sleep(3000);
		webActionUtil.clickOnElement(ClickOnNotices);
		Thread.sleep(3000);
		
	}
	
}
