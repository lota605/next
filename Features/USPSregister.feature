Feature:Validate USPS Register
Scenario Outline:Validate USPS Register


Given user visit able to USPS page
When user Click on Register and Click Sign Up Now
When user select dropdown choose language English
When user enter "<username>" "<password>"and "<Re-Type password>"
When user select dropdown First security question and "<type your answer1>" and"< Re-Type your answer1>"
When user select dropdown Second security question and "<type your answer2>" and "<Re-Type your answer2>"
When user Click Personal Account and Type "<firstname>""<lastname>"
When user Type "<Emailadress>"and"<Re-Typeemailadress>"
When user select dropdown US and "<phonenumber>"
When user select dropdown country and Type "<steet address>""<apt>"and"<city>"
When user select dropdown State and Type "<Zip code>"
When user click Verify Adress and click create Account
Then user should able to creat Register



Examples:
| username |  password  | Re-Type password |type your answer1| type your answer2|firstname |lastname |Emailadress | Re-Typeemailadress|vphonenumber|steet address|apt |city| Zip code|
| lota989 | Lm123456| Lm123456 |tangail|eid| Lota| Mahmud | lota.us606@gmail.com|lota.us606@gmail.com| 7814699970 |34 murray|apt 2|lynn| 01905| 
