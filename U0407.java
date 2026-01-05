package com.xpathAndgetTextDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0407 {
	public void T0407() throws InterruptedException {
		//System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.traininginomr.co.in");
		driver.manage().window().maximize();
		
		WebElement addressElement = driver.findElement(By.xpath("//footer//p[contains(text(),'Address')]"));
        WebElement phoneElement = driver.findElement(By.xpath("//footer//p[contains(text(),'Phone')]"));
        WebElement emailElement = driver.findElement(By.xpath("//footer//p[contains(text(),'Email')]"));
        
        String address = addressElement.getText();
        String phone = phoneElement.getText();
        String email = emailElement.getText();

        System.out.println("OMR Branch Details:");
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        
        Thread.sleep(1000);
        
        
        driver.quit();
		
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		U0407 T7 = new U0407();
		T7.T0407();
	}
}
