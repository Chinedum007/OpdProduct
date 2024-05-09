package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class DeleteMultipleBooking extends BasePage {

	public DeleteMultipleBooking(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}

	@FindBy(xpath="//a[text()='Weekly View']")
	private WebElement weekleyView;
	
	@FindBy(xpath="//input[@id='StartDate']")
	private WebElement ClickOnStartDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement SelectMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement SelectYear;
	
	@FindBy(xpath="//a[text()='7']")
	private WebElement SelectDate;
	
	@FindBy(id="searchBookings")
	private WebElement ClickSearchBtn;
	
	@FindBy(xpath="//a[@class='link']")
	private WebElement DoubleClickOnBooking;
	
	//at this stage add thread time
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement ClickOnDeleteBtn;
	
	@FindBy(id="submitButton")
	private WebElement ClickOnYesBtn;
	
	@FindBy(id="AllDelete")
	private WebElement ClickToSelectDeleteAllBookingsInSeries;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement ClickSubmitBtn;
	
	//add Thread 
	
	public void DeleteAllBookingsInSeries() throws InterruptedException {
		webActionUtil.clickOnElement(weekleyView);
		webActionUtil.clickOnElement(ClickOnStartDate);
		webActionUtil.selectByTextInListBox(SelectMonth, "Jun");
		webActionUtil.selectByTextInListBox(SelectYear, "2022");
		webActionUtil.clickOnElement(SelectDate);
		Reporter.log("Select the dates you want to delete",true);
		webActionUtil.clickOnElement(ClickSearchBtn);
		Reporter.log("Clickon search button to search date",true);
		Thread.sleep(5000);
		webActionUtil.doubleClick(DoubleClickOnBooking);
		Reporter.log("Select the booking you would like to delete",true);
		Thread.sleep(5000);
		webActionUtil.clickOnElement(ClickOnDeleteBtn);
		Reporter.log("Click on delete button",true);
		webActionUtil.clickOnElement(ClickOnYesBtn);
		webActionUtil.clickOnElement(ClickToSelectDeleteAllBookingsInSeries);
		Reporter.log("Select all other bookings in that series",true);
		webActionUtil.clickOnElement(ClickSubmitBtn);
		Reporter.log("Click Submit button to finally delete bookings",true);
		Thread.sleep(5000);
		
		
	}
	
}
