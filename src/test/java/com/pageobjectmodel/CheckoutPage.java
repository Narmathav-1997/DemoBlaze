package com.pageobjectmodel;

import java.io.IOException;


import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.checkoutPageInterfaceElement;
import com.pageobjecmanager.PageObjectManager;

public class CheckoutPage extends Base_Class implements checkoutPageInterfaceElement {
    @FindBy(id=cart_id)
    private WebElement cart;
    
    @FindBy(xpath=placeOrder_xpath)
    private WebElement placeOrder;
    
    @FindBy(id=name_id)
    private WebElement name;
    
    @FindBy(id=country_id)
    private WebElement country;
    
    @FindBy(id=city_id)
    private WebElement city;
    
    @FindBy(id=creditCard_id)
    private WebElement creditCard;
    
    @FindBy(id=month_id)
    private WebElement month;
    
    @FindBy(id=year_id)
    private WebElement year;
    
    @FindBy(xpath=puchase_xpath)
    private WebElement puchase;
    
    public CheckoutPage() {
    	
    	PageFactory.initElements(driver, this);
	}
    public void validcheckpage() throws IOException, InterruptedException {
    	elementClick(cart);
    	elementClick(placeOrder);
        getText(placeOrder);
    	Thread.sleep(2000);
    	passInput(name,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("name"));
    	passInput(country,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("country"));
    	passInput(city,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("city"));
    	passInput(creditCard,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("creditCard"));
    	passInput(month,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("month"));
        passInput(year,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("year"));

        Thread.sleep(2000);
        elementClick(puchase);
        takeScreenshotmethod(puchase_xpath);
        System.out.println("Product successfully purchased");
    }
}


