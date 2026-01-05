package com.alertDay9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_Tasks{
	public void T0906() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 // Open the website
        driver.get("https://www.omrbranch.com/api/documentation");
        driver.manage().window().maximize();
        
        String username = "greenstechchennaiomr@gmail.com";
        String password = "Greens@123";
        Alert al = driver.switchTo().alert();
        
        String text = al.getText();
        
        System.out.println(text);
              
        
	}
	public static void main(String[] args) {
		Day9_Tasks day9 = new Day9_Tasks();
		
		day9.T0906();
	}
}
