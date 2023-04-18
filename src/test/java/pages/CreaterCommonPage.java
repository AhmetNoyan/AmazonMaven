package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import utilities.Driver;

public class CreaterCommonPage {

	public CreaterCommonPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy (xpath = "//a[text()=' Items']")
	public WebElement itemsLink;
	
	
	
	
}
