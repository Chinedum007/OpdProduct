package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.WebActionUtil;

public class SignOutPage extends BasePage {

	public SignOutPage(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
	
	}

	@FindBy(xpath="//a[text()='Log Off']")
	private WebElement logOffButton;
	
	
	public void LogOut() {
		webActionUtil.clickOnElement(logOffButton);
	}
}
