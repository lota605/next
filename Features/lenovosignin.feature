Feature: Lenovo 
Scenario Outline: Lenovo

Given user visite Lenovo homepage
When user Signin dropdown and click Signin and click create Lenovo ID
When user click For Myself and click Continue with Email and type "<Email>" and "< First Name>" and "<Last Name>" and "<password>" and "<confirm password>"
When user select Rewands Signin and select Email SignUp and click Policy
Then user click on create Lenovo ID

Examples:
|Email|First Name|Last Name|password|confirm password|
|lota.us606@gmail.com|Lota|Mahmud|Lm12345|Lm12345|
 