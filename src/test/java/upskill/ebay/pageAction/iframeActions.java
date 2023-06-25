package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import groovy.json.internal.Exceptions;
import upskill.ebay.pageElements.iframeLocators;
import upskill.utilities.SetupDrivers;

public class iframeActions {

	 iframeLocators  iframeLocatorsobj;
public  iframeActions() {
	 iframeLocatorsobj= new iframeLocators(); 
	 PageFactory.initElements(SetupDrivers.driver, iframeLocatorsobj);
}
public void loadIframeHomePage() throws Exception{
SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
Thread.sleep(3000);
}
public void clickIframeHome()throws Exception{
	List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));

	for(int i=0;i<framelist.size();i++)
		SetupDrivers.driver.switchTo().frame(i);
	try{
		iframeLocatorsobj.btnHome.click();
	}catch(Exception e){
		System.out.println("Element not found in this iframe");	
	}
		
}
public void varifyIframeHome()throws Exception{
Thread.sleep(2000);
iframeLocatorsobj.btnHome.isDisplayed();
}
}