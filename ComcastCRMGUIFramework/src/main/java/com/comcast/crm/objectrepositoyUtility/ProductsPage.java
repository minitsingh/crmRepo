/**
 * 
 */
package com.comcast.crm.objectrepositoyUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author MINIT SINGH
 */
public class ProductsPage {
	
	WebDriver driver;
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@alt='Create Product...']")
	private WebElement createProductImgBtn;
	
	
	
	
	public WebElement getCreateProductImgBtn() {
		return createProductImgBtn;
	}
	
	
}
