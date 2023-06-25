package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import upskill.ebay.pageAction.EbayHomepageActions;
public class EbayHomepageLocators {
EbayHomepageActions EbayHomepageActionsobj;
	
	//Search Text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//Search Button
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;

	//link My Ebay
@FindBy(xpath="//a[@title='My eBay']")
public WebElement linkMyEbay;

@FindBy(xpath="//a[contains(text(),' Summary')] ")
public WebElement clickSummary;
}











