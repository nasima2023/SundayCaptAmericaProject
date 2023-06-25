package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import upskill.ebay.pageAction.ShettyIframeHomepageActions;

public class ShettyIframeHomepageLocators {
	ShettyIframeHomepageActions ShettyIframeHomepageActionsobj;
	
	@FindBy(xpath="(//a[contains(text(),'Home')])[1]")
	public WebElement btnHome;
}
 