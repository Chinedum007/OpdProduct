package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class DeleteCancellationReasons extends BasePage{

	public DeleteCancellationReasons(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}

	@FindBy(xpath="//div[text()='Administrator']")
	private WebElement AdministraorTab;
	
	@FindBy(xpath="//a[text()='Cancellation Reasons']")
	private WebElement CancellationReasonTab;
	
	@FindBy(xpath="//*[@id=\"main\"]/table/tbody/tr[1]/td[2]/a[2]")
	private WebElement ClickOnDeleteBtn;
	
	@FindBy(name="Delete")
	private WebElement ClickToConfirmDeleteBtn;
	
	public void deleteCancellationReasons() throws InterruptedException {
		
		webActionUtil.moveToElement(AdministraorTab);
		Reporter.log("Hover mouse to Administrator tab and click on it", true);
		
		webActionUtil.clickOnElement(CancellationReasonTab);
		Reporter.log("Click on the clinic type tab to open", true);
		
           Thread.sleep(2000);
           webActionUtil.clickOnElement(ClickOnDeleteBtn);
           webActionUtil.clickOnElement(ClickToConfirmDeleteBtn);
           Reporter.log("Clinic type deleted", true);
	
	}
}
