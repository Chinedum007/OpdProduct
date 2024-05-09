package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.WebActionUtil;

public class LoginPage extends BasePage {

		
		public LoginPage(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}

		@FindBy(id="UserName")
		private WebElement userNameTextField;
		
		@FindBy(id="Password")
		private WebElement passwordTextField;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement logOnButton;
		
		

		public void login(String userNameId, String passwordId) {
			webActionUtil.enterData(userNameTextField, userNameId);
			webActionUtil.enterData(passwordTextField, passwordId);
            webActionUtil.clickOnElement(logOnButton);
}
}
