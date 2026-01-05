package com.actionsClassDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class U0703 {
	public void T0703() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement primeMenu = driver.findElement(By.id("nav-link-amazonprime")); 
		
		Actions actions = new Actions(driver);
        actions.moveToElement(primeMenu).perform();
        
        Thread.sleep(1000);
		
        WebElement clkPrimeImage = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
        clkPrimeImage.click();
        
		String pageTitle = driver.getTitle();   
        System.out.println("Redirected Page: "+pageTitle);
        
        Thread.sleep(1000);
        
        driver.quit();		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0703 T3 = new U0703();
		T3.T0703();
		
	}

}
