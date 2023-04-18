package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserUtils;
import utilities.DataReader;
import utilities.Driver;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	BrowserUtils utils = new BrowserUtils();

	@FindBy(name = "email")
	public WebElement emailField;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	public WebElement button;

	@FindBy(xpath = "//h6[text()='Account Settings']")
	public WebElement header;

	@FindBy(xpath = "//p[text()='These credentials do not match our records.']")
	public WebElement errrorMessage;

	public void Login() {
		utils.actionsSendKeys(emailField, DataReader.getProperty("invalidUsername"));
		utils.actionsSendKeys(password, DataReader.getProperty("password"));
	}
}
