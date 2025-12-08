package com.pageobjectmanager;

import com.pageobjecmanager.PageObjectManager;
import com.pageobjectmodel.CheckoutPage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.SearchPage;
import com.utility.FileReaderManager;

public class PageObjectManager {

	
	private FileReaderManager fileReader;
	private LoginPage loginPage;
	private static PageObjectManager pageObjectManager;
	private SearchPage searchPage;
	private CheckoutPage checkoutPage;
	
	
	public FileReaderManager getFileReader() {
		if(fileReader==null){
			fileReader=new FileReaderManager();
		}
		return fileReader;
	}
	public LoginPage getLoginPage() {
		if(loginPage==null) {
			loginPage=new LoginPage();
		}
		return loginPage;
	}
	public static PageObjectManager getPageObjectManager() {
		if(pageObjectManager==null) {
			pageObjectManager=new PageObjectManager();
		}
		return pageObjectManager;
	}
	public CheckoutPage getCheckoutPage() {
		if(checkoutPage==null) {
			checkoutPage=new CheckoutPage();
		}
		return checkoutPage;
	}
	public SearchPage getSearchPage() {
		if(searchPage==null) {
			searchPage=new SearchPage();
		}
		return searchPage;
	}
	
	
   
}
