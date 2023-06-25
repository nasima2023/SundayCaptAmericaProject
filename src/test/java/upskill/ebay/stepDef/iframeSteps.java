package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.iframeActions;

public class iframeSteps {
	iframeActions iframeActionsobj=new iframeActions();

			@Given("^Open Shetty practice page$")
	public void open_Shetty_practice_page() throws Throwable {
		iframeActionsobj.loadIframeHomePage();
			}	

			@When("^click on iframe Home$")
	public void click_on_iframe_Home() throws Throwable {
		iframeActionsobj.clickIframeHome();
	}

			@Then("^it should reload iframe homepage$")
			public void it_should_reload_iframe_homepage() throws Throwable {
		iframeActionsobj.varifyIframeHome();
}
}

