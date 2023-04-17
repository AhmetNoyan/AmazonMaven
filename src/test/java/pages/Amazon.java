package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Amazon {

	public Amazon() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id="searchDropdownBox")
	public WebElement dropDown;
	
	@FindBy (id="twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy (id="nav-search-submit-button")
	public WebElement searchButton;
	
}
