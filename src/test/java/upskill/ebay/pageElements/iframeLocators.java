package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import upskill.ebay.pageAction.iframeActions;

public class iframeLocators {
	iframeActions IframmeActionsobj;
	
	@FindBy(xpath="(//a[contains(text(), 'Home')])[1]")
	public WebElement btnHome;    
}
