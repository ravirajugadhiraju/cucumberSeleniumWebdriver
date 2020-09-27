Feature: search and place order for Vegetabels
@SeleniumTest1
Scenario: Search for items and validte results
Given user is on greencart landing page
When user serarched for "Cucumber" vegetable
Then "Cucmber" results1 are displayed
And close the browser

@SeleniumTest
Scenario Outline: Search for items and validte results
Given user is on greencart landing page
When user serarched for <veg> vegetable
Then <veg> results1 are displayed
And   add vestible to cart 
And close the browser
Examples:
|veg|
|Cucumber|
|Brinjal|
