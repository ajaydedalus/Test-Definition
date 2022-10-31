Feature: Verifying the Lims web page

Scenario Outline:
To validate the lims login with valid username and password
Given user is on the lims login page
When user enter valid "<username>"and"<password>"
And user click the login button
And user click the menu
And user click the Test Definition
And user click the test
And user enter valid deatails
And user click the test method
And user enter reference range
And user enter Delta  check


Examples:
|username||password|
|VM      ||Pas123  |