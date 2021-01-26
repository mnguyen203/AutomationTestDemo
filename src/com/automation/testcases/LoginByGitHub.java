package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginByGitHub {
	WebDriver driver = new ChromeDriver();
	
	HomePage homepage = new HomePage(driver);
	
	LoginPage loginpage = new LoginPage(driver);
	
	
	@BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnguyen203\\eclipse-workspace\\POMTestWebsparks\\driverbrowser\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://todo-list-login.firebaseapp.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
  @Test
  public void LoginGitHub() {
	  homepage.clickLogin();
	  homepage.movetoGitPage();
	  
	  loginpage.enterUsername("mnguyen203");
	  loginpage.enterPassword("Mn0938371022");
	  loginpage.clickLogin();
	  
  }
  

  @AfterClass
  public void afterClass() {
  }

}
