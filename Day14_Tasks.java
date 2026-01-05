package com.takeScreenShotDay14;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


	public class Day14_Tasks {
		public void T1401() throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			   // Open the website
	        driver.get("https://www.omrbranch.com/");
	        driver.manage().window().maximize();

	        // Locate Username field and enter invalid username
	        WebElement txtUsername = driver.findElement(By.id("email"));
	        txtUsername.sendKeys("9944152058@omrbranch.com");

	        // Locate Password field and enter invalid password
	        WebElement txtPassword = driver.findElement(By.id("pass"));
	        txtPassword.sendKeys("9944152058");

	        // Click Login button
	        WebElement btLogin = driver.findElement(By.xpath("//button[@value='login']"));
	        btLogin.click();
	        
			Thread.sleep(2000);
			  //verify error message
			  
			  WebElement errorMessage = driver.findElement(By.xpath("//b[text()='User does not exist']")); 
			  if(errorMessage.isDisplayed()) { 
				System.out.println("Test Passed: Error message 'User does not exist' is displayed");
				
				TakesScreenshot ts = (TakesScreenshot)driver;
		        File src = ts.getScreenshotAs(OutputType.FILE);
		        System.out.println(src);
		        
		        File dest = new File("D:\\screenshot\\OmrBranch.png");
		        FileHandler.copy(src, dest);
				}
			  else {  
				  System.out.println("Test Failed: Error message not found"); 
				  }        
	        
			  Thread.sleep(1000);
	        
			  driver.quit();
			
		}
		
		public void T1402() throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
			 // Maximize window and set timeout
			driver.manage().window().maximize();
	       
			// Locate the paragraph element that starts with "We undertake"
	       WebElement paragraph = driver.findElement(By.xpath("//p[contains(text(),'We undertake')]"));
	       
	       // Capture screenshot of the paragraph element
	       File srcFile = paragraph.getScreenshotAs(OutputType.FILE);
	       System.out.println(paragraph);

	       File destFile = new File("D:\\screenshot\\java_training.png");
	       FileUtils.copyFile(srcFile, destFile);
	       
	       Thread.sleep(1000);
	       
	       driver.quit();
		}
		
		public void T1403() throws InterruptedException, IOException {
			System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
			driver.manage().window().maximize();
			
			Thread.sleep(500);
			
			
			WebElement scr1 = driver.findElement(By.xpath("//a[text()=' String ']"));
			
			
			WebElement dest1 = driver.findElement(By.id("java-class"));
			
			WebElement scr2 = driver.findElement(By.xpath("//a[text()=' List '] "));
			
			WebElement dest2 = driver.findElement(By.id("java-interface"));
			
			WebElement scr3 = driver.findElement(By.xpath("//a[text()=' Actions ']"));
			
			WebElement dest3 = driver.findElement(By.id("selenium-class"));
			
			WebElement scr4 = driver.findElement(By.xpath("//a[text()=' Webdriver ']"));
			
			WebElement dest4 = driver.findElement(By.id("selenium-interface"));
				
			
			Actions actions = new Actions(driver);
			
			actions.dragAndDrop(scr1, dest1).perform();
			actions.dragAndDrop(scr2, dest2).perform();
			actions.dragAndDrop(scr3, dest3).perform();
			actions.dragAndDrop(scr4, dest4).perform();
			
			WebElement btnSuccess = driver.findElement(By.xpath("//a[text()='Succesfully Matched!']"));
			if(btnSuccess.isDisplayed()) {
				System.out.println("Test Passed: Succefully Matched! is Displayed");
				
				TakesScreenshot ts = (TakesScreenshot)driver;
		        File src = ts.getScreenshotAs(OutputType.FILE);
		        System.out.println(src);
		        
		        File dest = new File("D:\\screenshot\\selenium_training.png");
		        FileHandler.copy(src, dest);
			}
			else {
				System.out.println("Test failed");
			}
			
			Thread.sleep(1000);
			
			driver.quit();
		}
		
		public void T1404() throws IOException, InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
			driver.manage().window().maximize();
			
			WebElement txtFirstName = driver.findElement(By.id("first_name"));
			txtFirstName.sendKeys("Greens");
			WebElement txtLastName = driver.findElement(By.id("last_name"));
			txtLastName.sendKeys("Tech");
			WebElement txtAddress = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
			txtAddress.sendKeys("3/178, Second Floor, Rajiv Gandhi Salai, Mettukuppam, Chennai, Tamil Nadu 600097");
			WebElement txtEmail = driver.findElement(By.id("email"));
			txtEmail.sendKeys("velmurugan@omrbranch.com");
			WebElement txtPhone = driver.findElement(By.id("phone"));
			txtPhone.sendKeys("9944152058");
			WebElement txtPassword = driver.findElement(By.id("password"));
			txtPassword.sendKeys("Greens@123");
			WebElement txtConfirmPassword = driver.findElement(By.id("confirm-password"));
			txtConfirmPassword.sendKeys("Greens@123");
			
			WebElement rdoMale = driver.findElement(By.id("male"));
			rdoMale.click();
			
			WebElement clkCricket = driver.findElement(By.id("checkbox-cricket"));
			clkCricket.click();
			
			WebElement selectLanguage = driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
			selectLanguage.click();
			
			WebElement selectEnglish = driver.findElement(By.xpath("//li[text()='English']"));
			selectEnglish.click();
			WebElement selectItalian = driver.findElement(By.xpath("//li[text()='Italian']"));
			selectItalian.click();
			
			WebElement selectSkills = driver.findElement(By.xpath("//select[@id='skills']"));
			Select skills = new Select (selectSkills);
			skills.selectByVisibleText("Java");
			skills.selectByVisibleText("Javascript");
			
			WebElement selectCountry = driver.findElement(By.id("country-list"));
			Select country = new Select(selectCountry);
			country.selectByVisibleText("India");
			
			WebElement selectYear = driver.findElement(By.id("dob"));
			Select year = new Select(selectYear);
			year.selectByVisibleText("2001");
			
			WebElement selectMonth = driver.findElement(By.id("months"));
			Select month = new Select(selectMonth);
			month.selectByVisibleText("October");
			
			WebElement selectDay = driver.findElement(By.id("days"));
			Select day = new Select(selectDay);
			day.selectByVisibleText("14");
			
			WebElement btnSubmit = driver.findElement(By.id("submitbtn"));
			btnSubmit.click();
			
			WebElement successMessage = driver.findElement(By.xpath("//h6[text()='Form submitted succesfully !!']"));
			if(successMessage.isDisplayed()) {
				 TakesScreenshot ts = (TakesScreenshot)driver;
			        File src = ts.getScreenshotAs(OutputType.FILE);
			        System.out.println(src);
			        
			        File dest = new File("D:\\screenshot\\Registerform.png");
			        FileHandler.copy(src, dest);
			        
			        Thread.sleep(1000);
			        
			        driver.quit();
			}
			else {
				System.out.println("Test failed: Error ");
			}

			
		}
		
		public void T1405() throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
			 // Maximize window and set timeout
			driver.manage().window().maximize();
			
			TakesScreenshot ts = (TakesScreenshot)driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        System.out.println(src);
	        
	        File dest = new File("D:\\screenshot\\Section1Page.png");
	        FileHandler.copy(src, dest);
	        
	        driver.quit();
	        	
		}
		public static void main(String[] args) throws IOException, InterruptedException {
			Day14_Tasks day14 = new Day14_Tasks();
			
			day14.T1401();
			day14.T1402();
			day14.T1403();
			day14.T1404();
			day14.T1405();
			
		}


}
