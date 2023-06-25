package upskill.ebay.pageAction;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCheckoutLocators;
import upskill.utilities.SetupDrivers;

public class  EbayCheckoutActions{
	
	EbayCheckoutLocators EbayCheckoutLocatorsobj;
	
	public EbayCheckoutActions (){
		EbayCheckoutLocatorsobj = new EbayCheckoutLocators();
		PageFactory.initElements(SetupDrivers.driver,EbayCheckoutLocatorsobj);
		
	}
	public void OpenNewPage(){
		for(String Winhandle: SetupDrivers.driver.getWindowHandles()){
	SetupDrivers.driver.switchTo().window(Winhandle);
		}
	}
	
	public void selectColor()throws Exception{
		Thread.sleep(2000);
		Select dropDawnObj = new Select(EbayCheckoutLocatorsobj.selectColor);
		dropDawnObj.selectByVisibleText("White / Carbon / Classic Red /...");
		Thread.sleep(2000);
		
	}

	public void SelectSize()throws Exception{
		Thread.sleep(2000);
		Select dropDawnObj=new Select(EbayCheckoutLocatorsobj.selectSize);
		dropDawnObj.selectByVisibleText("10");
		Thread.sleep(2000);
	}
	
	public void enterQuantity()throws Exception{
		Thread.sleep(2000);
		EbayCheckoutLocatorsobj.enterQuantity.clear();
		EbayCheckoutLocatorsobj.enterQuantity.sendKeys("2");
		Thread.sleep(3000);


		
	}
	public void buyItNow()throws Exception{
		EbayCheckoutLocatorsobj.btnbuyItNow.click();
		Thread.sleep(3000);
	}
	
}
