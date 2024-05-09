package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class RejectBookingRequest extends BasePage{

	public RejectBookingRequest(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}
	@FindBy(xpath="//a[@href='/OPDSitesv2_7_Period/Notice/Search']")
	private WebElement ClickOnNotices;
	
	@FindBy(xpath="//a[text()='Reject']")
	private WebElement ClickOnReject;
	
	@FindBy(id="RejectReasonDropdown")
	private WebElement SelectRejectionReason;
	
	@FindBy(xpath="/html/body/div[10]/div[3]/div/button[1]")
	private WebElement SubmitBtn;
	
	@FindBy(xpath="/html/body/div[5]/div[3]/div/button[2]")
	private WebElement ClickOnDontSendBtn;
	
	public void rejectBookingRequest() throws InterruptedException {
		webActionUtil.clickOnElement(ClickOnNotices);
		Reporter.log("Click on Notices");
		webActionUtil.clickOnElement(ClickOnReject);
		Reporter.log("Click on Reject link");
		Thread.sleep(3000);
		webActionUtil.selectByTextInListBox(SelectRejectionReason, "Too Short Notice");
		Reporter.log("Enter reason for rejection");
		webActionUtil.clickOnElement(SubmitBtn);
		Reporter.log("Click on send button");
		Thread.sleep(3000);
		webActionUtil.clickOnElement(ClickOnDontSendBtn);
		Reporter.log("Dont send email");
	}
	
}
