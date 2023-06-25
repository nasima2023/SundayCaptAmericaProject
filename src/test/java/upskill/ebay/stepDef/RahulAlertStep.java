package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.RahulAlertAction;

public class RahulAlertStep {
	RahulAlertAction RahulAlertActionobj= new RahulAlertAction();			
			
	@Given("^Open Rahul shetty practicepage$")
	public void open_Rahul_shetty_practicepage() throws Throwable {
		RahulAlertActionobj.LoadShettyHomepage();
		Thread.sleep(2000);  
	}

	@When("^Enter your name on Switch To Alert text box and click on alert button$")
	public void enter_your_name_on_Switch_To_Alert_text_box_and_click_on_alert_button() throws Throwable {
		RahulAlertActionobj.SwitchToAlerttextbox();
		
	}
	@Then("^Enter your name on Switch To Alert text box and Click on confirm$")
	public void enter_your_name_on_Switch_To_Alert_text_box_and_Click_on_confirm() throws Throwable {
		RahulAlertActionobj.clickConfirm();
}
}