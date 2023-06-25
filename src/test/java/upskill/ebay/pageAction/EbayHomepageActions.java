package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {

	EbayHomepageLocators EbayHomepageLocatorsObj;

	public EbayHomepageActions() {
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);
}

	public void searchShoes() {
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomepageLocatorsObj.btnSearch.click();
		
	}
public void searchItems(String Items){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(Items);
		EbayHomepageLocatorsObj.btnSearch.click();	
		
	}
public void BigTallTee(){
	EbayHomepageLocatorsObj.txtbxSearch.sendKeys("BigTallTee");
	EbayHomepageLocatorsObj.btnSearch.click();	
		}
public void clickSummary()throws Exception{
	EbayHomepageLocatorsObj.clickSummary.isEnabled();
	EbayHomepageLocatorsObj.clickSummary.click();
	Thread.sleep(2000);
	}
//Mousehover; 3 steps in Action; 1.call the obj of Action class 2.Move to element and 3.perform
public void mouseHoverMyEbay() throws Exception {
		Actions actions= new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomepageLocatorsObj.linkMyEbay);
		actions.perform();
		Thread.sleep(2000);
		}

	
	@SuppressWarnings("deprecation")
	public void synchronization(){
		/*	Selenium Wait : 
				1. Implicit wait(Global), 
				2. Explicit wait(Conditional), 
				3. Fluent wait(intermittent) */
			
		//Implicit Wait
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.btnSearch));
		
		//Fluent Wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(SetupDrivers.driver);								
		fluentWait.withTimeout(10, TimeUnit.SECONDS);
		fluentWait.pollingEvery(2, TimeUnit.SECONDS);
		}
	
	public void handleAlert(){
		SetupDrivers.driver.switchTo().alert().accept();
		SetupDrivers.driver.switchTo().alert().dismiss();
		SetupDrivers.driver.switchTo().alert().getText();
		SetupDrivers.driver.switchTo().alert().sendKeys("awesome");
	}
	public void keyboardKeys(){
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.UP);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.DOWN);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.CLEAR);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.DELETE);
	
	}
public void javaScriptExecutor(){
		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;	//Creating JS object
		js.executeScript("");
		js.executeScript("EbayHomePageLocatorsObj.btnSearch.click();"); //Clicking on element
		js.executeScript("EbayHomePageLocatorsObj.txtbxSearch.value ='shirt';"); //Writing something
		js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.checked=true;"); //Interect Checkbox
		js.executeScript("window.location = 'http://upskill.com';"); // initializing location
		js.executeScript("location.reload()"); 						//Refresh browser
		js.executeScript("alert('Confirmation');");					//Alert
		js.executeScript("window.scrollBy(0,500)", ""); 			//Scroll down to specific pixel
		js.executeScript("window.scrollBy(0,-500)", ""); 			//Scroll up to specific pixel
	    js.executeScript("arguments[0].scrollIntoView();", EbayHomepageLocatorsObj.btnSearch);  //Scroll to a object
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Scroll down to bottom of website
	}
}

