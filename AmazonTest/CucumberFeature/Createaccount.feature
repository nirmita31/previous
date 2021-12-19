Feature: Amazon singIn
Scenario: Positive scenario with valid credentials
Given User is on homepage
When user click signin button
And user enter username
And user click next button
And user enter password
And user click submit
Then user on signinpage 

