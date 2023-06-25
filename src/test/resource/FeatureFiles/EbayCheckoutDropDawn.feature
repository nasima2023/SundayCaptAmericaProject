@regression @smoke @CA-1 @E2E
Feature: Ebay Check-out Functionality 

Description: User should able to check-out the items

Background: 
Given Open Ebay Homepage 

Scenario: Ebay Check-out Functionality 
Given Search for shoes
When Select the first shoes
And Select color
And Select size
And Select quantity
Then Add to buy it now

