
@SmokeTest
Feature: seaching product 

Scenario Outline: searching product in google 

Given i am on the google homepage 


When i enter the "<goods_name>" in the search bars 
And i click on the search button



Then i can see the search result successfully 


Examples: 
| goods_name |
|  HI         | 
	