Feature: validate USPS login
Scenario Outline: user can login USPS

Given user visit USPS homepage
When user click on signin button
When user insert valid "<username>" and valid "<PW>" and click next
Then user should be able to log in


Examples:
| username |  PW  |
| lota989| Lm123456  |