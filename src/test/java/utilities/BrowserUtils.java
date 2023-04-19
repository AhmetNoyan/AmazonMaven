package utilities;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
	Actions action;
	WebDriverWait wait;
	Select letsSelect;

	public void actionsSendKeys(WebElement element, String text) {
		action = new Actions(Driver.getDriver());
		action.sendKeys(element, text).build().perform();
	}

	public void waitUntilElementVisible(WebElement element) {
		wait = new WebDriverWait(Driver.getDriver(), 2);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	// select by visible text
	public void selectByVisibleText(WebElement selectElement, String tobeSelectedOptionText) {
		letsSelect = new Select(selectElement);
		letsSelect.selectByVisibleText(tobeSelectedOptionText);
	}

	// return the selected option from the dropdown
	public String getSelectedOption(WebElement selectElement) {
		letsSelect = new Select(selectElement);
		String option = letsSelect.getFirstSelectedOption().getText();
		return option;
	}

	public void clearInputField(WebElement inputField) {
		inputField.sendKeys(Keys.CONTROL + "a");
		inputField.sendKeys(Keys.BACK_SPACE);

	}
	
	public int randomNumber() {
		Random rand=new Random();
		int randomNum=rand.nextInt((999-100)+1)+100;
		return randomNum;
		
		
		
	}
}
