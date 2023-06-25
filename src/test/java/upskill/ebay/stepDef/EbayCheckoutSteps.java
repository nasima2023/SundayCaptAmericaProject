package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayCheckoutActions;

public class EbayCheckoutSteps {
	
	EbayCheckoutActions EbayCheckoutActionsobj =new EbayCheckoutActions();
	
	@When("^Select color$")
	public void select_color() throws Throwable {
		  EbayCheckoutActionsobj.OpenNewPage();
	   EbayCheckoutActionsobj.selectColor(); 
	}

	@When("^Select size$")
	public void select_size() throws Throwable {
		  EbayCheckoutActionsobj.SelectSize();
	}

	@When("^Select quantity$")
	public void select_quantity() throws Throwable {
		  EbayCheckoutActionsobj.enterQuantity();
	}

	@Then("^Add to buy it now$")
	public void add_to_buy_it_now() throws Throwable {
		  EbayCheckoutActionsobj.buyItNow();  
	}

	
}
