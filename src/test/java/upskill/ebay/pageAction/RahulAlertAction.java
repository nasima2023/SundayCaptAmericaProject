package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.RahulAlertLocators;
import upskill.utilities.SetupDrivers;

public class RahulAlertAction {
	RahulAlertLocators RahulAlertLocatorsobj;
	
	public RahulAlertAction(){
		
	RahulAlertLocatorsobj =new RahulAlertLocators();
	PageFactory.initElements(SetupDrivers.driver, RahulAlertLocatorsobj);
}
	public void LoadShettyHomepage()throws Exception{;
	SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(3000);
	}
	
public void SwitchToAlerttextbox()throws Exception{
	RahulAlertLocatorsobj.txtbxSearch.sendKeys("Nasima");
	RahulAlertLocatorsobj.clickAlert.click();
	Thread.sleep(2000);
	}

public void clickConfirm()throws Exception{
	SetupDrivers.driver.switchTo().alert().accept();
	RahulAlertLocatorsobj.txtbxSearch.sendKeys("Nasima");
	RahulAlertLocatorsobj.clickConfirm.click();
	Thread.sleep(2000);
		}
}
/*public class ShettyIframeHomepageActions {

ShettyIframeHomepageLocators ShettyIframeHomepageLocatorsobj;
		
		public ShettyIframeHomepageActions(){
			
			ShettyIframeHomepageLocatorsobj =new ShettyIframeHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, ShettyIframeHomepageLocatorsobj);
	}	
public void LoadShettyHomepage()throws Exception{;
	SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(3000);
}
public void ClickIframeHome() throws Exception{
	
	List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
	
	for(int i=0;i<framelist.size();i++)
		SetupDrivers.driver.switchTo().frame(i);
	
	try{
		ShettyIframeHomepageLocatorsobj.btnHome.click();
	}catch(Exception e){
		System.out.println("Element not found in this iframe");
	}
}
public void varifyShettyHomepage()throws Exception{
	Thread.sleep(2000);
	ShettyIframeHomepageLocatorsobj.btnHome.isDisplayed();
}
}
*/