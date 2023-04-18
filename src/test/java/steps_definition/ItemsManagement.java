package steps_definition;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.CreaterCommonPage;
import pages.ItemsPage;
import pages.LoginPage;
import utilities.DataReader;
import utilities.Driver;

public class ItemsManagement {
	
	LoginPage loginpage=new LoginPage();
	ItemsPage itemsPage=new ItemsPage();
	CreaterCommonPage commonPage=new CreaterCommonPage();
	
	@Given("As an entity user, I am logged in")
	public void as_an_entity_user_i_am_logged_in() {
		Driver.getDriver().get(DataReader.getProperty("appUrl"));
		
	}

	@Given("I navigate to Items tab")
	public void i_navigate_to_items_tab() {
		commonPage.link.click();
		Assert.assertTrue(itemsPage.itemsPageHeaderText.isDisplayed());
	}

	@When("I click on the Add Item button")
	public void i_click_on_the_add_item_button() {
		
	}

	@Then("I should be on item input page")
	public void i_should_be_on_item_input_page() {
		
	}

	@When("I provide item information name {string}, price {string}, unit {string}, and description {string}")
	public void i_provide_item_information_name_price_unit_and_description(String string, String string2,
			String string3, String string4) {
		
	}

	@When("I click Save Item button")
	public void i_click_save_item_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The Item is added to the Item list table")
	public void the_item_is_added_to_the_item_list_table() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
