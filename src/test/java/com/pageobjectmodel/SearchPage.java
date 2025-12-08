package com.pageobjectmodel;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.SearchPageInterfaceElement;

public class SearchPage extends Base_Class implements SearchPageInterfaceElement {
      @FindBy(linkText=laptop_linkText)
      private WebElement laptop;
      
      @FindBy(linkText=sonivaioi5_linkText)
      private WebElement sonivaio;
      
      @FindBy(linkText=addcart_linkText)
      private WebElement addcart;
      
      public SearchPage() {
    	 PageFactory.initElements(driver, this); 
	}
      public void validSearchPage() throws InterruptedException {
      elementClick(laptop);
      elementClick(sonivaio);
      Thread.sleep(3000);
      elementClick(addcart);
   //  clickJSE(addcart); 
      
}
}

