package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0311 {
	
	  public void T0313() throws InterruptedException {
	  System.setProperty("webDriver.chrome.driver",
	  "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.swiggy.com/"); driver.manage().window().maximize();
	  
	  WebElement locationInput =
	  driver.findElement(By.xpath("//input[@id='location']"));
	  locationInput.click(); locationInput.sendKeys("Chennai");
	  
	  WebElement firstLocation =
	  driver.findElement(By.xpath("(//span[@class='_2OORn'])[1]"));
	  firstLocation.click();
	  
	  
	  WebElement txtRestaurant= driver.findElement(By.
	  xpath("//input[@placeholder='Search for restaurants and food']"));
	  txtRestaurant.sendKeys("Domino's Pizza");
	  
	  WebElement btnFirst=
	  driver.findElement(By.xpath("//button[@class='xN32R _3ZX8u']"));
	  btnFirst.click();
	  
	  Thread.sleep(1000);
	  
	  driver.quit(); 
	  }
	  
	  public static void main(String[] args) throws InterruptedException {
		  U0311 T11 = new U0311();
		  
		  T11.T0313();
	}
	  
	 
}
