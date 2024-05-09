package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class searchBookings extends BasePage {

	public searchBookings(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	
	}
	@FindBy(xpath="//div[text()='Booking']")
	private WebElement bookingTab;
	
	@FindBy(xpath="//a[text()='Search Bookings']")
	private WebElement searchBookingsBtn;
	
	@FindBy(id="advancedSearchButton")
	private WebElement advanceSearchBtn;
	@FindBy(id="//script[@src='/OPDSitesv2_7_Period/bundles/BookingSearch?v=A-IZpUct8YVz7Ux44ZypEHyA0kl4Z-6bRwlxERNlrpM1']")
	private WebElement scriptPage;
	
	public void searchForAllBookings() throws InterruptedException {
		webActionUtil.moveToElement(bookingTab);
		Reporter.log("Hover mouse to booking tab and click on it", true);
		
		webActionUtil.clickOnElement(searchBookingsBtn);
		Reporter.log("Click on the search bookings tab to open", true);
		
		webActionUtil.clickOnElement(advanceSearchBtn);
		Reporter.log("Click on advanced search button to return bookings", true);
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 700);");
		Reporter.log("Scroll down!to view more bookings",true);
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, -700);");
		Reporter.log("Scroll up!", true);
		Thread.sleep(3000);
		
	}
}
