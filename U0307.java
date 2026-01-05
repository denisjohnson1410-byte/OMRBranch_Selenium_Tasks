package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0307 {
	
	  public void T0309() { 
		  System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
	  
		  driver.get("https://www.redbus.in/"); driver.manage().window().maximize();
	  
		  WebElement txtFrom= driver.findElement(By.xpath("//input[@id='src']"));
		  txtFrom.sendKeys("Bangalore");
	  
		  WebElement txtTo = driver.findElement(By.xpath("//input[@id='dest']"));
		  txtTo.sendKeys("Chennai");
	  
		  WebElement clkDate = driver.findElement(By.xpath("//span[@class='dateText']")); 
		  clkDate.click();
	  
		  WebElement selectDate = driver.findElement(By.xpath("//div[@class='sc-kAzzGY cCrHkP']"));
	 
		  selectDate.click();
	  
		  WebElement btnSearch = driver.findElement(By.xpath("//button[@id='search_button']"));
		  btnSearch.click();
	  
		  driver.quit();
	  
	  
	  }
	  
	  public static void main(String[] args) {
		  U0307 T7 = new U0307();
		  T7.T0309();
	}
	 

}
