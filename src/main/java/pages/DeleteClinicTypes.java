package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class DeleteClinicTypes extends BasePage{

	public DeleteClinicTypes(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}

	@FindBy(xpath="//div[text()='Administrator']")
	private WebElement AdministraorTab;
	
	@FindBy(xpath="//a[text()='Clinic Types']")
	private WebElement ClinicTypesTab;
	
	@FindBy(xpath="//*[@id=\"main\"]/table/tbody/tr[1]/td[2]/a[2]")
	private WebElement ClickOnDeleteBtn;
	
	@FindBy(name="Delete")
	private WebElement ClickToConfirmDeleteBtn;
	
	public void deleteClinicType() throws InterruptedException {
		webActionUtil.moveToElement(AdministraorTab);
		Reporter.log("Hover mouse to Administrator tab and click on it", true);
		
		webActionUtil.clickOnElement(ClinicTypesTab);
		Reporter.log("Click on the clinic type tab to open", true);
		
           Thread.sleep(3000);
           
           webActionUtil.clickOnElement(ClickOnDeleteBtn);
           webActionUtil.clickOnElement(ClickToConfirmDeleteBtn);
           Reporter.log("Clinic type deleted", true);
	}
}
