 package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	//Validate Shoes Items
			@FindBy(xpath="//span[contains(text(), 'Shoes')]")
			public WebElement txtShoes;
			
			//Validate Shirts Items
			@FindBy(xpath="//span[contains(text(), 'Shirts')]")
			public WebElement txtShirts;
			
			//Validate Pants Items
			@FindBy(xpath="//span[contains(text(), 'Pants')]")
			public WebElement txtPants;
			
			//Checkbox Brand Adidas
			@FindBy(xpath="//input[@aria-label='adidas']")
			public WebElement cbxBrandAdidas;

			//Checkbox Brand Nike
			@FindBy(xpath="//input[@aria-label='Nike']")
			public WebElement cbxBrandNike;

			//Checkbox Brand Unbranded
			@FindBy(xpath="//input[@aria-label='Unbranded']")
			public WebElement cbxBrandUnbranded;
	
		/*//validate Sunglass Items
		@FindBy(xpath="//span[contains(text(),'sunglasses')]")
		public  WebElement txtSunglasses;
		
		//validate Watches Items
		@FindBy(xpath="//Span[contains(text(), 'watches')]")
		public WebElement txtWathches;
		
		//validate perfumes Items
		@FindBy(xpath="//Span[contains(text(), perfumes)]")
		public WebElement txtPerfumes;
		
		//checkbox Brand Gucci
		//FindBy(xpath="")*/


		//shirt link
		@FindBy(xpath="//span[contains(text(), 'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT')]")
		public WebElement linkShirtItems;
		
		//link shoes
		@FindBy(xpath="(//span[contains(text(),'Reebok ')])[1]")
		public WebElement linkShoe;
	}
		
	

		
		
		
		
		