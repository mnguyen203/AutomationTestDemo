package com.automation.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardToDoList {
	 WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public DashBoardToDoList(WebDriver driver) {
	          this.driver = driver;
	 }
	 
	 //Locator for logout button
	 By logoutBtn = By.xpath("//button[@class=\"btn btn-default\"]");
	 
	 //Locator for list name text box 
	 By listnameTbox = By.xpath("//div[@class=\"row\"]//input\"");
	 
	 //Locator for add list button
	 By addBtn = By.xpath("//div[@class=\"row\"]//button");
	 
	 //Locator for remove button
	 By removeBtn = By.xpath("//button[@class=\"btn btn-default\"]");
	 
	 //Locator for List Items
	  @SuppressWarnings("unchecked")
	List<By> allElements = (List<By>) By.xpath("(//ul[@class=\"list-group\"])");
	 
	 // Method to input list name 
	 public String generateListname(int length) {		 
		    return RandomStringUtils.randomAlphabetic(length);	
}
	 public void InputListName() {
		 for (int i = 1; i <= 10; i++) {
				// Random name of item 
			 	driver.findElement(listnameTbox).click();
			 	driver.findElement(listnameTbox).sendKeys(generateListname(6));
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//Add item to Lists
				driver.findElement(addBtn).click();
				WebDriverWait wait_Add_items = new WebDriverWait(driver,10);
				wait_Add_items.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("(//ul[@class=\"list-group\"]//button)")+"["+ i +"]")));
				driver.findElement(listnameTbox).clear();
				
				
				
				}
			//Verified items in list
			for (By element: allElements) {
			      System.out.println("TC2- Get list name:" + ((WebElement) element).getText());
			    
			}
	 }
	 // Method to click remove button in list name
	 
	 // Method to click logout button
	 
}
