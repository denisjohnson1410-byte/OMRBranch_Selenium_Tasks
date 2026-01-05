package com.actionsClassDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class U0702 {
	public void T0702() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement mouseOverCourse = driver.findElement(By.xpath("//a[text()='Courses ']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(mouseOverCourse).perform();
		
		WebElement clkSelenium = driver.findElement(By.xpath("(//a[text()='Selenium'])[1]"));
		clkSelenium.click();
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Greens@123");
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Login']"));
		btnLogin.click();
		
		WebElement errorMessage = driver.findElement(By.id("errorMessage"));
		
		if(errorMessage.isDisplayed()) {
			System.out.println("Invalid credentials");
		}else {
			System.out.println(txtEmail.getAttribute("value") + " Succesful Login");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		U0702 T2 = new U0702();
		T2.T0702();
	}

}
