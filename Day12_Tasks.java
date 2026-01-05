package com.NestedFramesDay12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_Tasks {
	public void T1201() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 // Open the website
        driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
        driver.manage().window().maximize();
        
        driver.switchTo().frame(1);
        WebElement auto = driver.findElement(By.xpath("//h2[text()='Automation']"));
        System.out.println(auto.getText());
        driver.switchTo().frame("core-java");
        WebElement core = driver.findElement(By.xpath("//h4[text()='Core Java']"));
        System.out.println(core.getText());
        driver.switchTo().frame("oops");
        WebElement oops = driver.findElement(By.xpath("//p[text()='1.1 OOPS']"));
        System.out.println(oops.getText());
        
        WebElement in = driver.findElement(By.xpath("//li[text()='Inheritance']"));
        System.out.println(in.getText());
        WebElement ab = driver.findElement(By.xpath("//li[contains(text(),'Ab')]"));
        System.out.println(ab.getText());
        WebElement po = driver.findElement(By.xpath("//li[contains(text(),'Po')]"));
        System.out.println(po.getText());
        WebElement en = driver.findElement(By.xpath("//li[contains(text(),'En')]"));
        System.out.println(en.getText());
        
        driver.switchTo().parentFrame();
        WebElement core1 = driver.findElement(By.xpath("//h4[text()='Core Java']"));
        System.out.println(core1.getText());
        
        driver.switchTo().frame("collections");
        WebElement collection = driver.findElement(By.xpath("//p[text()='1.2 Collections']"));
        System.out.println(collection.getText());
        WebElement li = driver.findElement(By.xpath("//li[text()='List']"));
        System.out.println(li.getText());
        WebElement se = driver.findElement(By.xpath("//li[text()='Set']"));
        System.out.println(se.getText());
        WebElement ma = driver.findElement(By.xpath("//li[text()='Map']"));
        System.out.println(ma.getText());
        driver.switchTo().parentFrame();
        driver.switchTo().frame("collections");
        WebElement collection2 = driver.findElement(By.xpath("//p[text()='1.2 Collections']"));
        System.out.println(collection2.getText());
        
//        driver.switchTo().parentFrame();      
//        driver.switchTo().frame("core-java");
//        WebElement core3 = driver.findElement(By.xpath("//h4[text()='Core Java']"));
//        System.out.println(core3.getText());
        
        Thread.sleep(1000);
        
        driver.quit();    
	}
	
	public void T1202() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 // Open the website
        driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
        driver.manage().window().maximize();
        
        driver.switchTo().frame(1);
        WebElement auto = driver.findElement(By.xpath("//h2[text()='Automation']"));
        System.out.println(auto.getText());
        driver.switchTo().frame("selenium");
        WebElement sel = driver.findElement(By.xpath("//h4[text()='Selenium']"));
        System.out.println(sel.getText());
        driver.switchTo().frame("actions");
        WebElement act = driver.findElement(By.xpath("//p[text()='Actions']"));
        System.out.println(act.getText());
        
        WebElement mo = driver.findElement(By.xpath("//li[text()='Move to Ele']"));
        System.out.println(mo.getText());
        WebElement cl = driver.findElement(By.xpath("//li[text()='Click']"));
        System.out.println(cl.getText());
        WebElement dc = driver.findElement(By.xpath("//li[text()='Double Click']"));
        System.out.println(dc.getText());
        
        driver.switchTo().parentFrame();
        WebElement sel1 = driver.findElement(By.xpath("//h4[text()='Selenium']"));
        System.out.println(sel1.getText());
        
        driver.switchTo().defaultContent();
	    
	    WebElement txtPara = driver.findElement(By.xpath("//p[contains (text(),'We undertake')]"));
	    
	    System.out.println(txtPara.getText());
	    
	    Thread.sleep(1000);
	    
	    driver.quit();
        
	}
	public static void main(String[] args) throws InterruptedException {
		
		Day12_Tasks day12 = new Day12_Tasks();
		
		day12.T1201();
		day12.T1202();
		
	}

}
