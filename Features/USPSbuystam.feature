Feature: Validate Buy Stam in USPS
Scenario Outline:

Given user able to USPS project Stam
When user click on Stam Supplies and click US Falg 
When user click Add to card and click checkout now
When user click checkout as Guest and type "<Fastname>""<Lastname>""<phone>"and"<email>"
When user click in Box 
When user type"<Address1>""<Address2>"and "<city>"
When user select dropdown State and type"<Zip code>" and click checkout
Then user should be redirects Buy Stam

Examples:
| Fastname |  Lastname | phone | email |Address1|Address2|city|Zip code|
| Lota | Mahmud | 7814699970 | lota.us6Fas06@gmail.com |34 murray st|Apt2|Lynn|01905|