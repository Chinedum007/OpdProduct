package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class AddBooking extends BasePage{

	public AddBooking(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
	
	@FindBy(xpath="//div[text()='Booking']")
	private WebElement bookingTab;
	
	@FindBy(xpath="//a[@href='/OPDSitesv2_7_Period/Booking/Create']")
	private WebElement addNewBookingTab;
	
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
	@FindBy(xpath="//button[text()='Send']")
	private WebElement clickToSendEmailNotification;
	@FindBy(xpath="/html/body/div[4]/div[3]/div/button")
	private WebElement clickOkButton;
	
	public void createSingleBooking() throws InterruptedException {
		webActionUtil.moveToElement(bookingTab);
		webActionUtil.clickOnElement(addNewBookingTab);
		Reporter.log("Click on New Booking button", true);
		
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
		webActionUtil.clickOnElement(clickToSendEmailNotification);
		Reporter.log("Send Email notification", true);
		webActionUtil.clickOnElement(clickOkButton);
		Reporter.log("Click on Ok button to complete booking",true);
	}

}
