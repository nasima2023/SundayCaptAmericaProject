package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {

	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions(){
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	}
	
	public void switchNewWindow(){
		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
		SetupDrivers.driver.switchTo().window(winhandle);
		}
	}
	
	public void selectSizeType() throws Exception{
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartLocatorsObj.ddSizeType);
		//dropDownObj.selectByVisibleText("Big & Tall");
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		Thread.sleep(2000);
	}
	
	public void selectMenSize() throws Exception{
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartLocatorsObj.ddMenSize);
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("MenSize"));
//		dropDownObj.selectByVisibleText("8XLT");
		//dropDownObj.selectByIndex(5);
		Thread.sleep(2000);
	}
	
	public void selectShade() throws Exception{
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartLocatorsObj.ddShade);
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Shade"));
//		dropDownObj.selectByVisibleText("White");
		//dropDownObj.selectByValue("14");
		Thread.sleep(2000);
	}
	
	public void enterQuantity() throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorsObj.txtbxQty.clear();
		EbayCartLocatorsObj.txtbxQty.sendKeys(ReadExcelSheet.getMapData("Quantity"));
		EbayCartLocatorsObj.txtbxQty.sendKeys("2");
		Thread.sleep(2000);
	}
	
	public void addToCart() throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorsObj.btnAddCart.click();
		Thread.sleep(2000);
	}
}