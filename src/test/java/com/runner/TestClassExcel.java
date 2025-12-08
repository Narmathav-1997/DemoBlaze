package com.runner;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class TestClassExcel {
public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		String userName = ReadExcelData.readParticularData(2,0);  //2,0 //String userName = 
		
		driver.findElement(By.id("email")).sendKeys(userName);
		
		String password = ReadExcelData.readParticularData(2,1);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.youtube.com/");
//	String userName = ReadExcelData.readParticularData2(0,0);
//	driver.findElement(By.name("search_query")).sendKeys(userName);
//	WebElement element = driver.findElement(By.xpath("//button[@title='Search']"));
//	element.click();
//	System.out.println("successfully done");
	}
}


