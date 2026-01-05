package com.actionClassAndRobotDay8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0803 {
	public void T0803() throws AWTException, InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		
		String email = "greenstechchennaiomr@gmail.com";
		for(char c:email.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
            Thread.sleep(100);
			
		}
		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        
        String password = "Greens@123";
        for (char c : password.toCharArray()) {
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
            Thread.sleep(100);
        }
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(2000);
        
        driver.quit();	
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		U0803 T3 = new U0803();
		T3.T0803();
	}
	
	

}
