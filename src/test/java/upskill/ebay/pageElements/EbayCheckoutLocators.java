package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class EbayCheckoutLocators {


	//Select Colors
	@FindBy(xpath="//select[@aria-label='Please select a Color']")
	public WebElement selectColor;

	
	//select size
	@FindBy(xpath="//select[@selectboxlabel='Size']")
	public WebElement selectSize;
	
	//select Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement enterQuantity;
	
	@FindBy(xpath="//span[text()='Buy It Now']")
	public  WebElement btnbuyItNow;
	
	}
