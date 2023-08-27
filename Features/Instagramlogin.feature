Feature:Instagrm Log in

Scenario Outline:

Given user visit Instagram homepage
When user enter "<phonenumber>"and "<password>"
When user click Log in button
Then user able to Log in Instagram
Examples:
|phonenumber|password|
|7812673858|Tm781267385|
