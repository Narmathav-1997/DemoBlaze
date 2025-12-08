package com.runner;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class TestClass extends Base_Class{
	public static void main(String[] args) throws InterruptedException, IOException {
	launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
    launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
    PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
    PageObjectManager.getPageObjectManager().getSearchPage().validSearchPage();
    PageObjectManager.getPageObjectManager().getCheckoutPage().validcheckpage();
    
	}
}

