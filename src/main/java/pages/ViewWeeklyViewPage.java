package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class ViewWeeklyViewPage extends BasePage{

	public ViewWeeklyViewPage(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
        @FindBy(xpath="//a[text()='Weekly View']")
        private WebElement weeklyViewButton;
        
        
        public void weeklyView() {
        	webActionUtil.clickOnElement(weeklyViewButton);
        	Reporter.log("Click on the weekly view button to open to weekly view page", true);
        }
}
