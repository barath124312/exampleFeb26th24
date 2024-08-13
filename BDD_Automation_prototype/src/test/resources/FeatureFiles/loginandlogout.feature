#Author: 
#User Story Name:
#User Story No:
#Scenario Names:
#Testcase Name:
#Description:
Feature: Verify login and logout functionalities
Scenario: Verify login functionality
Given I launch the chrome browser
And I navigate url of the application
When I Enter the Username and Password in textfield
And I click on the login button
And I minimise flyout window
Then I find home page
Scenario: Verify logout functionality
And click on logout
And I close The application
