Feature: Check the functionality of edit account

Scenario: Editing the account with set of data

Given Launch the browser
And Load the url 'https://login.salesforce.com'
And Enter the username 'vinothkumar@testleaf.com'
And Enter the password 'SeleniumChallenge@24'
When Click the login button
Then User should be able to login
When Click the app launcher icon
And Click the accounts tab 
And Click the edit button
And Set type to technology partner
And Set industry to healthcare
Given Enter the billing address '506B kumaranstreet'
And Enter the shipping address '506B kumaranstreet'
And Set customer priority to low
And Set sla to silver
And Set active to no
And Enter unique phone number '9500804268'
And Enter upsell opportunity to no
When click save button
Then Verify phone number





