Feature: validate ebay searchicon
Scenario Outline: validate ebay searchicon

Given user visits able to ebay homepage
When user types"<dresses for women>"
When user click in searchicon
Then user should be able to see expected dresses


Examples:
| dresses for women |
| pink dresses  |
