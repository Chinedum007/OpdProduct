package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class ReportForBookingPreventions extends BasePage {

	public ReportForBookingPreventions(WebDriver driver, WebActionUtil webActionUtil) {
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
	
	public void viewBookingsPreventionsReport() throws InterruptedException {
		
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
	}
	
}
