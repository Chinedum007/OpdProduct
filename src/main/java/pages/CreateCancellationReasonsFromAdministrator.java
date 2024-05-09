package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class CreateCancellationReasonsFromAdministrator extends BasePage{

	public CreateCancellationReasonsFromAdministrator(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}


	@FindBy(xpath="//div[text()='Administrator']")
	private WebElement AdministraorTab;
	
	@FindBy(xpath="//a[text()='Cancellation Reasons']")
	private WebElement CancellationReasonTab;
	
	@FindBy(xpath="//a[text()='Create New']")
	private WebElement ClickOnCreateTab;
	
	@FindBy(xpath="//a[text()='Back to List']")
	private WebElement ClickBackList;
	
	@FindBy(id="Description")
	private WebElement EnterDescription;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement ClickOnCreateBtn;
	
	public void createCancellationReason() throws InterruptedException {
		webActionUtil.moveToElement(AdministraorTab);
		Reporter.log("Hover mouse to Administrator tab and click on it", true);
		
		webActionUtil.clickOnElement(CancellationReasonTab);
		Reporter.log("Click on the clinic type tab to open", true);
		
           Thread.sleep(2000);
           
           webActionUtil.clickOnElement(ClickOnCreateTab);
           Thread.sleep(2000);
           webActionUtil.clickOnElement(ClickBackList);
           Thread.sleep(4000);
           Reporter.log("Testing the Back to List link that it works and go back to create ", true);
           
           webActionUtil.clickOnElement(ClickOnCreateTab);
           Reporter.log("Create on the create btn to open the create page", true);
           
           webActionUtil.enterData(EnterDescription, "A test");
           Thread.sleep(2000);
           webActionUtil.clickOnElement(ClickOnCreateBtn);
           Thread.sleep(2000);
           Reporter.log("A test is created", true);
           
           
	}
}
