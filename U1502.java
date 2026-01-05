package com.windowsHandlingDay15
;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class U1502 {
	
	public void T1503() throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearch.sendKeys("iPhone X");
		
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnSearch.click();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='c7a0d166-cfe4-4b3e-afb1-abfcd68d28fc']")));
		@Nullable
		
		
		
		String productLink = firstProduct.getAttribute("href");
		 ((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", productLink);
		 
		 String allWindows = driver.getWindowHandle();
		 for(String eachWindow : driver.getWindowHandles() ) {
			 if(!eachWindow.equals(allWindows)) {
				 driver.switchTo().window(eachWindow);
				 break;
			 }
		 }
		 
		 WebElement productPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-price-whole']")));
		 System.out.println("Product Price: "+productPrice);
		 
		 Thread.sleep(1000);
		 
		 driver.quit();
		 
	}
	
	public static void main(String[] args) throws InterruptedException {
		U1502 T2 = new U1502();
		T2.T1503();
		
	}

}
