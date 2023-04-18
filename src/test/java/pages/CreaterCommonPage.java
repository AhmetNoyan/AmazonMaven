package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import utilities.Driver;

public class CreaterCommonPage {

	public CreaterCommonPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy (linkText="//h3[text()='New Item']")
	public WebElement link;
	
	
	
	
	
}
