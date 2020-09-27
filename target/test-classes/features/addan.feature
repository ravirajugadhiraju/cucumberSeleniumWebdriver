Feature: Application Login

Background:
Given login verfication
When web verficaiton
Then Background complete.
 

Scenario: Home page default login
Given user is on landing page
When user login into application with "jin" and "@12345"
Then Home page is populated
And Cards are displayed "true"

Scenario: Home page default login
Given user is on landing page
When user login into application with "bin" and "@987456"
Then Home page is populated
And Cards are displayed "False"

Scenario: Home page default login
Given user is on landing page
When user login with following details
|jenny|abcd|john@abcd.com|indi|sdfsd|
Then Home page is populated
And Cards are displayed "False"


Scenario Outline: Home page default login
Given user is on landing page
When user login into application1 with <usr> and <pwd>
Then Home page is populated
And Cards are displayed "False"
Examples:
|usr|pwd|
|raviraju|gadhiraju|
|ravi|gadhiraju|
|madi|gadi|


























































