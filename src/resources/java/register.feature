Feature: Register to testme app
Scenario: Registration
Given User is in testme app
And click the signup link
Then the registration page is displayed
And user enters username as "priyanka123"
And user enters firstname as "priyanka"
And user enters lastname as "lodhe"
And user enters password as "Priyanka123"
And user enters confirm password as "Priyanka123"
And user selects gender
And user enters email as "priyanka123@gmail.com"
And user enters mobile_number "9999999999"
And user enters DOB "01/02/2000"
And user enters address "perengulatur"
And user selects security question
And user enters answer "blue"
Then click on register