@regression @itemsTest
Feature: Items Management
Background: 
	Given As an entity user, I am logged in
  And I navigate to Items tab
  
  
	@createItem @smoketest
	Scenario: As a user, I am able to create an item or a service 
    When I click on the Add Item button
    Then I should be on item input page
    When I provide item information name "Books", price 18, unit "pc", and description "a good book"
    And I click Save Item button
    Then The Item is added to the Item list table
	@updateItem
  Scenario: As a user, I am able to update an item or a service
    When I select the item "Books"
    And I should be on item details page
    When I update the item price to 3500 dollars
    And I click Update Item button
    Then the Item price is updated to 35 dollars
    
   Scenario Outline: Invalid credential login attempt
   When I enter email "<email>" and password "<password>"
   And I click on login button
   Then I should see an error message 
   And I should not logged in 
    
    