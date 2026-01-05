package com.framesDay11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_Tasks {
		public void T1101() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			 // Open the website
	        driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
	        driver.manage().window().maximize();
	        
	       driver.switchTo().frame("java-content");
	       
	       WebElement txtElement = driver.findElement(By.xpath("//h4[text()='Have Fun While You Learn']"));
	       
	       System.out.println("Text inside the Frame: "+txtElement.getText());
	       
	       Thread.sleep(1000);
	       
	       driver.quit();
	       
		}
		
		public void T1102() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			 // Open the website
	        driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
	        driver.manage().window().maximize();
	        
	        driver.switchTo().frame("java-content");
		       
		    WebElement txtElement = driver.findElement(By.xpath("//h4[text()='Have Fun While You Learn']"));
		       
		    System.out.println("Text inside the Frame: "+txtElement.getText());
		    
		    driver.switchTo().defaultContent();
		    
		    WebElement txtPara = driver.findElement(By.xpath("//p[contains (text(),'We undertake')]"));
		    
		    System.out.println(txtPara.getText());
		       
		    Thread.sleep(1000);
		    
		    driver.quit();
			
		}
		
		public static void main(String[] args) throws InterruptedException {
			Day11_Tasks day11 = new Day11_Tasks();
			
			day11.T1101();
			day11.T1102();
		}

}
