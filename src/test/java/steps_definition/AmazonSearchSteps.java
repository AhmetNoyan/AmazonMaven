package steps_definition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import pages.Amazon;
import utilities.BrowserUtils;
import utilities.DataReader;
import utilities.Driver;

public class AmazonSearchSteps {

	Amazon amazon = new Amazon();
	BrowserUtils utils = new BrowserUtils();

	@Given("As a user, I am on the amazon home page")
	public void as_a_user_i_am_on_the_amazon_home_page() {
		Driver.getDriver().get(DataReader.getProperty("amazonUrl"));
		Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
	}

	@Then("dropdown value is by default {string}")
	public void dropdown_value_is_by_default(String string) {
		Select choose = new Select(amazon.dropDown);
		Assert.assertTrue(choose.getFirstSelectedOption().getText().equals(string));
	}

	@When("select department Home & Kitchen")
	public void select_department_home_kitchen() {
		Select choose = new Select(amazon.dropDown);
		choose.selectByVisibleText("Home & Kitchen");
	}

	@And("search {string}")
	public void search(String string) {
		amazon.searchBox.sendKeys(string);
		amazon.searchButton.click();
	}

	@Then("verify you are on {string} search results page")
	public void verify_you_are_on_search_results_page(String string) {
		Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
	}

	@And("verify you are in {string} department")
	public void verify_you_are_in_department(String string) {
		Select choose = new Select(amazon.dropDown);
		Assert.assertTrue(choose.getFirstSelectedOption().getText().equals(string));
	}

}
