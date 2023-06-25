package upskill.ebay.pageAction;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.ShettyIframeHomepageLocators;
import upskill.utilities.SetupDrivers;



public class ShettyIframeHomepageActions {

ShettyIframeHomepageLocators ShettyIframeHomepageLocatorsobj;
		
		public ShettyIframeHomepageActions(){
		ShettyIframeHomepageLocatorsobj =new ShettyIframeHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, ShettyIframeHomepageLocatorsobj);
	}	
public void LoadShettyHomepage()throws Exception{
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
