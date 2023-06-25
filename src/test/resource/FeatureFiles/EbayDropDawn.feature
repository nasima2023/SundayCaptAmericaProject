@regression @smoke @CA-2 @E2E
Feature: Ebay cart functionality

Description: User should able to add the items to the cart

Background:
           Given open Ebay Homepage

Scenario: Ebay cart Functionality
           
            Given Search for Big and Tall Cotton Tee
            When Select the first shirt on the items
            And Select Size type
            And Select Men size
            And Select Shade
            And Select Quantity
            Then Add to cart
            
             