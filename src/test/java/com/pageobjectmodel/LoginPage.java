package com.pageobjectmodel;

import java.io.IOException;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.LoginPageInterfaceElement;
import com.pageobjectmanager.PageObjectManager;

public class LoginPage extends Base_Class implements LoginPageInterfaceElement {
	@FindBy(linkText= login_linkText)
	private WebElement login;
	
	@FindBy(id=username_id)
	private WebElement username;
	
	@FindBy(css=password_css)
	private WebElement password;
	
	@FindBy(xpath=signin_xpath)
	private WebElement signin;
	
	@FindBy(id=title_id)
	private WebElement title;
	
	public LoginPage() {
       
		PageFactory.initElements(driver, this);
	
	}
	public void validLogin() throws IOException, InterruptedException {
		elementClick(login);
		Thread.sleep(5000);
		passInput(username, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("username"));
		passInput(password, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("password"));
  //      PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
     elementClick(signin);
     System.out.println("Login successfully");
     takeScreenshotmethod(signin_xpath);
     Thread.sleep(3000);
     getText(title);
     
	}

}


