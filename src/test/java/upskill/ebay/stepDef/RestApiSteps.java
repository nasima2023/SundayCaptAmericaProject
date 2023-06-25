package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.api.restassured.PetstoreRestAssuredActions;

public class RestApiSteps {
	PetstoreRestAssuredActions PetstoreRestAssuredActionsobj = new PetstoreRestAssuredActions();
	
@Given("^Create pet$")
public void create_pet() throws Throwable {
	PetstoreRestAssuredActionsobj.createPet();
}

@Given("^Get pet$")
public void get_pet() throws Throwable {
	PetstoreRestAssuredActionsobj.getPet();
}

@When("^Update pet$")
public void update_pet() throws Throwable {
	PetstoreRestAssuredActionsobj.updatePet();
}

@When("^Delete pet$")
public void delete_pet() throws Throwable {
	PetstoreRestAssuredActionsobj.deletePet();
}

	
	
}

	    



