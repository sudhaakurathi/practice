Feature: User Registration

Scenario:Validates Registration
When launches Chrome and registration page
When user enters Username as "Darkchocolate" in us field
When user enters Firstname as "Dark" in fn field
When user enters Lastname as "Chocolate" in la field
When user enters Password as "choco123" in password field
When user enters Confirmpassword as "choco123" in confirmpassword field
When user selects Gender as "male" in gender
When user enters emailid as "choco123@gmail.com" in email field
When user enters mobileno "9876543210" in mobilenumber field
When user enters dateofbirth "12/11/1994" in dateofbirth field
When user enters Address "moon light street, chennai" in address field
When user selects Security question "What is your Birth Place?" in security question field
When user selects Answer for security question "pedana" in answer field
And Click on Register Button
Then validates Registration is passed
