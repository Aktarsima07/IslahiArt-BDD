@Register
Feature: Register
User registers on the webpage

Background:
Given User is on webpase "https://islahiart.com/"

@positive
Scenario: Register with valid Data
When User click Register button
Then User click Sing Up button
And User enter "Aktarsima3@gmail.com" as Email
And User enter "sima" as First Name "aktar" as Last Name
Then User enter "Rks0701@" as Password
And User enter "Rks0701@" as Confirm password
Then User accept the privacy Policy
And User click on Sing Up button
Then User register successfully