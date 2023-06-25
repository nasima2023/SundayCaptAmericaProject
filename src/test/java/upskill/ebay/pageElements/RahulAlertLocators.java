package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import upskill.ebay.pageAction.RahulAlertAction;

public class RahulAlertLocators {
	RahulAlertAction RahulAlertActionobj;
	
	//Search Text Box
		@FindBy(xpath="//input[@placeholder='Enter Your Name']")
		public WebElement txtbxSearch;
		
		@FindBy(xpath="//input[@value= 'Alert']")
		public WebElement clickAlert;
		
		@FindBy(xpath="//input[@value= 'Confirm']")
		public WebElement clickConfirm;	
}																																																																				


