package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class EditCancellationReasons extends BasePage {

	public EditCancellationReasons(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}

	@FindBy(xpath="//div[text()='Administrator']")
	private WebElement AdministraorTab;
	
	@FindBy(xpath="//a[text()='Cancellation Reasons']")
	private WebElement CancellationReasonTab;
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement ClickOnEditTab;
	
	@FindBy(id="Description")
	private WebElement ClearandEnterDescriptionField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ClickSaveBtn;
	
	public void editCancelationReasons() throws InterruptedException {
		webActionUtil.moveToElement(AdministraorTab);
		Reporter.log("Hover mouse to Administrator tab and click on it", true);
		
		webActionUtil.clickOnElement(CancellationReasonTab);
		Reporter.log("Click on the clinic type tab to open", true);
		
           Thread.sleep(2000);
           webActionUtil.clickOnElement(ClickOnEditTab);
   		Reporter.log("Click on edit button", true);
   		
   		Thread.sleep(3000);
   		
   		webActionUtil.enterData(ClearandEnterDescriptionField, "AAA Test");
   		Reporter.log("Enter description AAA Test", true);
   		Thread.sleep(3000);
   		
   		webActionUtil.clickOnElement(ClickSaveBtn);
   		Reporter.log("Click on save button", true);
   		
   		Thread.sleep(2000);
	}
}
