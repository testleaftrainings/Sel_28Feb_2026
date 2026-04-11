Feature: Login Function of Leaftaps application


Scenario: Login with Valid Credentials

Given Launch the browser
And Load the url
And Enter the username as 'Demosalesmanger'
And Enter the password as 'crmsfa'
When Click on the Login button
Then User should be loggedin


Scenario: Login with Invalid Credentials

Given Launch the browser
And Load the url
And Enter the username as 'Demo'
And Enter the password as 'crm'
When Click on the Login button
But It throws error message


