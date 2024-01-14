Feature: Register functionality scenarios

Scenario: Verify weather the user is able to register into application by providing all details
Given User launch application 
And navigate to register page
When User provide all the below valid details
|First name | Ice              |
|Last name  | Markovski        |
|Email      | Ice1bt@gmail.com |
|Telephone  | 1234567890       |
|Password   | 12345            | 
And Select privacy policy
And Click on Contiune button
Then User account shoud successfully be created




      |