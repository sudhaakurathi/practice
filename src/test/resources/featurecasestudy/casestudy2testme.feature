Feature: Login with multiple data
Scenario Outline: testme app
When launches chrome and login testme
When user enter the "<username>" in us field
When user enter the "<password>" in pwd field
And user click on login button
Then validates login is passed

Examples:
|username|password|
|aakurathi|sudha123|


