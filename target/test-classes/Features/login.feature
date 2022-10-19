Feature: To validate the login functionality of kavida application
@smoke
Scenario: To validte the login with valid credentials
Given The user should be in kavida login page
When The user should enter firstname, email and jobtitle
And The user should click the start tour button
And The user open the Control Tower Action
Then The user should see the Threats & Alert
And The user click the Order TimeLine Action
And The user click the Communication Hub
When Click the Compose an Email
Then The user should The Add Shipping Information  
When The user  Enter Vessel Tracking Id
And The user click the Global Risks
Then The user should be in valid page