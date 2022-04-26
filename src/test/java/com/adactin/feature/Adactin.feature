Feature: Hotel booking in adactin
@Ad1
Scenario Outline: Login page
Given user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Clicks In The Login Button And Navigates To The Search Hotel Page
Examples:
|username|password|
|ammukutty25202125202|ammukutty252021|
|ABC|123|
|Gayathri7696|SD95CF|
@Ad2
Scenario: Search Hotel Page
When user Select The "London"
And user Select The Hotels
And user Select The Room Type
And user Select The Number Of Rooms
And user Enter Check In Date In Check In Date Field
And user Enter Check Out Date In Check Out Date Field
And user Select Adults Per Room
Then user Clicks Search Button And Navigates To The Select Hotel Page
@Ad3
Scenario: Select Hotel Page
When user Select The Hotel
Then user Clicks Continue Button And Navigates To Book A Hotel Page
When user Enter First Name In First Name Field
And user Enter Last Name In Last Name Field
And user Enter Address In Billing Address Field
And user Enter Credit Card Number In Credit Card Field
And user Select Credi Card Type
And user Select Expiry Date
And user Enter Cvv Number In Cvv Field
Then user Clicks Book Now Button And Navigates To Hotel Booking Page
@Ad4
Scenario: Hotel Booking Page
When user Clicks Logout Button And Navigates To Logout Page

