package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class AddMultipleBookings extends BasePage {

	public AddMultipleBookings(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	
	}

	@FindBy(xpath="//div[text()='Booking']")
	private WebElement bookingTab;
	
	@FindBy(xpath="//a[text()='Create Multiple Bookings']")
	private WebElement CreateMultipleBookingsBtn;
	
	@FindBy(xpath="//input[@id='StartDate']")
	private WebElement ClickOnStartDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement SelectMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement SelectYear;
	
	@FindBy(xpath="//a[text()='7']")
	private WebElement SelectDate;
	
	@FindBy(xpath="//input[@id='FinishDate']")
	private WebElement ClickOnFinishDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement SelectMonthForFinishDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement SelectYearForFinishDate;
	
	@FindBy(xpath="//a[text()='9']")
	private WebElement SelectDateForFinishDate;
	
	@FindBy(id="TimeSlot_PeriodTypeId")
	private WebElement SelectPeriod;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ClickOnNextBtn;
	
	@FindBy(id="Booking_ClinicName")
	private WebElement typeClinicName;
	
	@FindBy(id="Booking_ClinicTypeID")
	private WebElement selectClinicType;
	
	@FindBy(id="TimeSlot_PeriodTypeId")
	private WebElement selectPeriod;
	
	@FindBy(xpath="//a[@href='#']")
	private WebElement clickOnAddRoom;
	
	@FindBy(id="roomAutocomplete")
	private WebElement enterRoomName;
	
	@FindBy(id="ConsultantID")
	private WebElement selectClinicLead;
	
	@FindBy(id="SpecialityID")
	private WebElement selectClinicLeadSpeciality;
	
	@FindBy(id="TimeFirstAppointment")
	private WebElement enterFirstAppointment;
	@FindBy(id="TimeLastAppointment")
	private WebElement enterLastAppointment;
	@FindBy(id="NewPatients")
	private WebElement enterNewPatients;
	@FindBy(id="FollowUpPatients")
	private WebElement enterFollowUpPatients;
	@FindBy(xpath="//a[@class='addClinicCode']")
	private WebElement clickToAddClinicCode;
	@FindBy(xpath="//button[text()='Add']")
	private WebElement clickOnAddToAddRoom;
	@FindBy(id="saveBooking")
	private WebElement clickToSaveBooking;
	
	@FindBy(id="submitMainForm")
	private WebElement ClickOnSubmit;
	@FindBy(xpath="/html/body/div[3]/div[3]/div/button[2]")
	private WebElement ClickOnDontSendBtn;
	
	public void CreateMultipleBookings() throws InterruptedException {
		webActionUtil.moveToElement(bookingTab);
		webActionUtil.clickOnElement(CreateMultipleBookingsBtn);
		webActionUtil.clickOnElement(ClickOnStartDate);
		webActionUtil.selectByTextInListBox(SelectMonth, "Jun");
		webActionUtil.selectByTextInListBox(SelectYear, "2022");
		webActionUtil.clickOnElement(SelectDate);
		webActionUtil.clickOnElement(ClickOnFinishDate);
		webActionUtil.selectByTextInListBox(SelectMonthForFinishDate, "Jun");
		webActionUtil.selectByTextInListBox(SelectYearForFinishDate, "2022");
		webActionUtil.clickOnElement(SelectDateForFinishDate);
		Reporter.log("Select the 7th,8th and 9th of Jun 2022", true);
		webActionUtil.selectByTextInListBox(SelectPeriod, "All Day");
		Reporter.log("Select All Day",true);
		webActionUtil.clickOnElement(ClickOnNextBtn);
		webActionUtil.enterData(typeClinicName, "Chin's Clinic");
		Reporter.log("Enter clinic Name", true);
		
		webActionUtil.selectByTextInListBox(selectClinicType, "Clinical Trial");
		webActionUtil.selectByTextInListBox(selectPeriod, "All Day");
		webActionUtil.clickOnElement(clickOnAddRoom);
		Reporter.log("Add Room", true);
		
		Thread.sleep(5000);
		webActionUtil.enterData(enterRoomName, "Clinic 2");
		webActionUtil.selectByTextInListBox(selectClinicLead, "Abbey, A, Dr");
		webActionUtil.selectByTextInListBox(selectClinicLeadSpeciality, "Clinical Biochemistry");
		webActionUtil.enterData(enterFirstAppointment, "14:00");
		webActionUtil.enterData(enterLastAppointment, "18:00");
		webActionUtil.enterData(enterNewPatients, "1");
		webActionUtil.enterData(enterFollowUpPatients, "1");
		webActionUtil.clickOnElement(clickToAddClinicCode);
		Thread.sleep(10000);
		webActionUtil.clickOnElement(clickOnAddToAddRoom);
		Thread.sleep(5000);
		webActionUtil.clickOnElement(clickToSaveBooking);
		Reporter.log("Complete the add room form and save booking", true);
		webActionUtil.clickOnElement(ClickOnSubmit);
		Thread.sleep(5000);
		webActionUtil.clickOnElement(ClickOnDontSendBtn);
	}
}
