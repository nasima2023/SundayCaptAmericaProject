package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		
	}
@When("^Search for shoes$")
  public void search_for_shoes() throws Throwable {
  EbayHomepageActionsObj.searchShoes();
    Thread.sleep(2000);
}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
	EbayHomepageActionsObj.searchItems(items);
	Thread.sleep(2000);
	}

/* @Given("^Search for \"([^\"]*)\"$")
public void search_for(String Items) throws Throwable {
EbayHomepageActionsObj .searchItems(Items);  
}*/


@Given("^Search for Big and Tall Cotton Tee$")
public void search_for_Big_and_Tall_Cotton_Tee() throws Throwable {
	EbayHomepageActionsObj.searchItems("Big & Tall Cotton Tee");
}
@Given("^Search for Shoes$")
public void search_for_Shoes() throws Throwable {
	EbayHomepageActionsObj.searchShoes();    
}
@Given("^Open ebay homepage$")
public void open_ebay_homepage() throws Throwable {
	 Thread.sleep(2000);
}
   
@When("^Mousehover to My Ebay$")
public void mousehover_to_My_Ebay() throws Throwable {
	EbayHomepageActionsObj.mouseHoverMyEbay();	
}
@Then("^Click on summary$")
public void click_on_summary() throws Throwable {
	EbayHomepageActionsObj.clickSummary();
	}
    }
  


