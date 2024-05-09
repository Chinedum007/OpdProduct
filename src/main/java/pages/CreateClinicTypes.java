package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class CreateClinicTypes extends BasePage {

	public CreateClinicTypes(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}

	@FindBy(xpath="//div[text()='Administrator']")
	private WebElement AdministraorTab;
	
	@FindBy(xpath="//a[text()='Clinic Types']")
	private WebElement ClinicTypesTab;
	
	@FindBy(xpath="//a[text()='Create New']")
	private WebElement ClickOnCreateTab;
	
	@FindBy(id="Description")
	private WebElement EnterDescription;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement ClickOnCreateBtn;
	
	
	public void createClinicTypes() throws InterruptedException {
		
		
			webActionUtil.moveToElement(AdministraorTab);
			Reporter.log("Hover mouse to Administrator tab and click on it", true);
			
			webActionUtil.clickOnElement(ClinicTypesTab);
			Reporter.log("Click on the clinic type tab to open", true);
			
	           Thread.sleep(3000);
	           
	           webActionUtil.clickOnElement(ClickOnCreateTab);
	           webActionUtil.enterData(EnterDescription, "12345");
	           webActionUtil.clickOnElement(ClickOnCreateBtn);
	           Reporter.log("12345 created", true);
	           
	}
}
