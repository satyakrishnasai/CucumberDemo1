Feature: My Standard Chartered Bank Account

Background: Launching of the app landing page
Given Srinivas is done with browswer configuration
Then He launches the applicattion in his favorite chrome browser

Scenario: Sign In with Srinivas
Given He clicks on the sign in link
Then He enters the valid credentials
And he clicks on the submit button

Scenario: Sign Up for the guest user
Given Guest user clicks on the sign up link
When He provides all the mandatory data
Then He clicks on submit and id is generated

Scenario: Srinivas wanted to reset hi  password
Given He clicks on the forgot password link
Then He enters the mobile number
And He receives the otp and he provides the same