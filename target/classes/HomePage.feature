@Login
Feature: HomePage Login Feature

@PositivePhoneNumber
Scenario: Positive HomePage Login1

Given user is on the 99acres HomePage Website1
When user clicks on dropdown to select loginRegister1
And user clicks on LoginRegister1
And user enters the number
And user clicks continue after entering the number
And user enters otp
And user clicks on submit1
Then user is on LoginHomePage

@PositiveEmailID
Scenario: Positive HomePage Login2
Given user is on the 99acres HomePageWebsite11
When user clicks on dropdown to select LoginRegister11
And user clicks on loginRegister11
And user enters email 
And user clicks continue after entering the EmailId
And user enters Password1
And user clicks on submit11
Then user is on LoginHomePage

@PositiveUserName
Scenario: Positive HomePage Login3
Given user is on the 99acres HomePage_Website111
When user clicks on dropdown to select loginRegister111
And user clicks on loginRegister111
And user enters "<sheetname>" and <rownumber>
And user clicks continue after entering the UserName
And user enters password11
And user clicks on submit111
Then user is on LoginPageHome
Examples:
|sheetname|rownumber|
|Register|0|
|Register|1|
|Register|2|
|Register|3|
|Register|4|
                                 

@Negative
Scenario Outline: Negative Login Scenario

Given user is on the 99acres HomePage WebsiteZZ
When user clicks on dropdown to select loginRegisterZZ
And user clicks on loginRegisterZZ
And user enters "<EmailId>"
And user clicks on continue button
And user enters passwordN
And user clicks on LoginZZ
Then user is on LoginPageZZ
Examples:
|EmailId|
|greeshugmail.com|
|greeshma|

@TopMenu
Scenario: Validate TopMenu/Information
Given user is on the HomePage
When user clicks on TopMenu
Then user is on TopMenuPage

@PageInformation
Scenario: Validate TopMenu/Information
Given user is on the Website
When user clicks on Buy
When user clicks on Rent
When user clicks on PG / Co-living
When user clicks on Commercial
When user clicks on CoWorking
Then user is on the WebSite