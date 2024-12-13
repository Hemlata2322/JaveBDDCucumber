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
@tag
Feature: Login Functionality
  I want to use this template for Login feature file

  @tag1
  Scenario: Successful Login with valid credentials
    Given User navigates to login page
    And User switches to Login tab
    When User enters valid username and password
    And User clicks on login button
    Then User is redirected to the home page
   # And Check the title of home page to confirm successful login

 
