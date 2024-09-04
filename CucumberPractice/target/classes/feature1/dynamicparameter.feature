Feature: Creating Account is Sales force Application

Scenario Outline: Account Creation in sales force

Given Launch the browser
And Load the url as 'https://login.salesforce.com'
And Enter the username as 'vinothkumar@testleaf.com'
And Enter the password as 'SeleniumChallenge@24'
When lick on login button
Then User should be able to login
When Click on toggle menu 
And Click view all button
And Click sales
And Click accounts tab
And Click new 
Given Enter account name as <accountname>
And Choose ownership public
When Click save button
And Account should be created
Then Verify account name


Examples:

|accountname|
|nivetha|
|john|
|suzana|


