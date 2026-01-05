package com.webTablesDay17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U1701 {
	public void T1701() throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		
		for(WebElement tableRow:tableRows) {
			System.out.println(tableRow.getText());
					
		}
		
		Thread.sleep(1000);
		
		driver.quit();
	
	}
	
	public void T1702() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table"));
		
		WebElement firstRow = table.findElement(By.xpath("//tr[1]"));
		
		List<WebElement> columns = firstRow.findElements(By.xpath(".//td"));
		
		for(WebElement column:columns){
			String text = column.getText();
			System.out.println(text);
			
		}
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}
	
	public void T1703() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table"));
		
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));
		
		int rowsCount = rows.size();
		
		System.out.println("Total count of row in the table: "+rowsCount);		
		
		Thread.sleep(1000);
		
		driver.quit();
			
	}
	
	public void T1704() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']"));
		
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));
		
		
		 for (WebElement row : rows) {
             List<WebElement> columns = row.findElements(By.xpath(".//td"));
             for (WebElement column : columns) {
                 System.out.print(column.getText()+"\t");
                 
             }
             System.out.println();
		 }
		 
		 Thread.sleep(1000);
			
		 driver.quit();
		
	}
	
	public void T1705() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']"));
		
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));
		
		for (int i = 1; i < rows.size(); i += 2) {
            WebElement evenRow = rows.get(i);
            List<WebElement> columns = evenRow.findElements(By.xpath(".//td"));

            // Extract and print the content of the even-numbered rows
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t");
            }
            System.out.println();
        }
		
		Thread.sleep(1000);
		
		 driver.quit();
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		U1701 T1 = new U1701();
		T1.T1701();
		T1.T1702();
		T1.T1703();
		T1.T1704();
		T1.T1705();
	}

}
