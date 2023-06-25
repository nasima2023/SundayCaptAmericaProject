@regression @Smoke @CA-02 @E2E
Feature: Ebay Brand Outline

Description:user should able to filter items by Brand

Background:
Given open Ebay Homepage

Scenario Outline: Filter items by Brand
        Given Search for "<Items>"
		When Filter by "<Brand>"
		Then Item list should have products of "<Brand>"
	
	Examples:
		|Items		|Brand		|
		|Sunglasses	|Gucci		|
		|Watches	|Rolex		|
		|Perfumes	| Chanel	|
