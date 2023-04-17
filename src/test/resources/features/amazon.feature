#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@amazonSearch
Feature: Amazon search functionality
	User should be able to make a successful search
	
	@test1
	Scenario: Successful Search
		Given As a user, I am on the amazon home page
		Then dropdown value is by default "All Departments"
		When select department Home & Kitchen
		And search "coffee mug"
		Then verify you are on "coffee mug" search results page
		And verify you are in "Home & Kitchen" department
