Feature: Login in to TestME app
Scenario Outline: Login 

Given user is not logged in
When user perform login using "<username>" and "<password>"
Then user is logged in successfully

Examples:
   |username||password|
   |lalitha||Password123|