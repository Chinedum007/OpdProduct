package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class EditPreventionBooking extends BasePage{

	public EditPreventionBooking(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement ReportsTab;
	
	@FindBy(xpath="//a[text()='Booking Preventions']")
	private WebElement BookingPreventionTab;
	
	@FindBy(id="FinishDate")
	private WebElement SearchToField;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement SelectMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement SelectYear;
	
	@FindBy(xpath="//a[text()='8']")
	private WebElement SelectDatepicker;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement ClickOnSearch;
	
	@FindBy(xpath="//a[text()='View Details']")
	private WebElement ClickOnViewDetails;
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement ClickOnEditBtn;
	
	@FindBy(xpath="//a[@class='removeDate']")
	private WebElement ClickOnRemoveDate;
	
	@FindBy(id="submitButton")
	private WebElement ClickOnSubmitBtn;
	
	@FindBy(xpath="//a[text()='Back to Prevention']")
	private WebElement ClickOnBackToPreventionBtn;
	
	public void editPreventionBookings() throws InterruptedException {
		webActionUtil.moveToElement(ReportsTab);
		Reporter.log("Hover mouse to Reports tab and click on it", true);
		
		webActionUtil.clickOnElement(BookingPreventionTab);
		Reporter.log("Click on Booking Prevention tab to open", true);
		
		webActionUtil.clickOnElement(SearchToField);
		
		webActionUtil.selectByTextInListBox(SelectMonth,"Mar");
		webActionUtil.selectByTextInListBox(SelectYear, "2022");
		webActionUtil.clickOnElement(SelectDatepicker);
		Thread.sleep(2000);
		Reporter.log("Select month, year and date the 8th", true);
		
		webActionUtil.clickOnElement(ClickOnSearch);
		Thread.sleep(5000);
		Reporter.log("Click search button to display result", true);
		
		webActionUtil.clickOnElement(ClickOnViewDetails);
		Reporter.log("Click view button to view result", true);
		
		webActionUtil.clickOnElement(ClickOnEditBtn);
		webActionUtil.clickOnElement(ClickOnRemoveDate);
		Reporter.log("Click on edit and then remove one of the dates", true);
		webActionUtil.clickOnElement(ClickOnSubmitBtn);
		Thread.sleep(3000);
		webActionUtil.clickOnElement(ClickOnBackToPreventionBtn);
		Reporter.log("Click on back to prevention page to view update", true);
		Thread.sleep(5000);
	}
}
