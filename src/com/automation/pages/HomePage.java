package com.automation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class HomePage {
 
	 WebDriver driver;
	 String winHandleBefore;
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public HomePage(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 //Locator for login button GitHub
	 By LoginBtnGit = By.xpath("//a[@class=\"btn btn-social btn-github\"]");
	 
	 //Method to click login button
	 public void clickLogin() {
		 driver.findElement(LoginBtnGit).click();
	 }
	 
	 public void movetoGitPage() {
		 winHandleBefore = driver.getWindowHandle();
	 }
}
