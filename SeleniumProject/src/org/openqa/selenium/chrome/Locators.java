package org.openqa.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo/");
			
//		WebElement Username = driver.findElement(By.name("username"));
//		
//		Username.sendKeys("Jeffson Mendonsa");
//		
//		WebElement Password = driver.findElement(By.className("oxd-input oxd-input--active"));
//		
//		Password.sendKeys("Heyy");
		
//		WebElement ForgotPassword = driver.findElement(By.className("oxd-text oxd-text--p orangehrm-login-forgot-header"));
//		
//		ForgotPassword.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		WebDriver drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement EmailAddress = drivers.findElement(By.id("input-email"));
		EmailAddress.sendKeys("Jeffson Mendonsa");
		
//		WebElement Password = drivers.findElement(By.id("input-password"));
//		Password.sendKeys("Selenium");
		
		WebElement password = drivers.findElement(By.name("password"));
		password.sendKeys("Trial Paasword");
		
		Thread.sleep(5000);
		
		WebElement Login = drivers.findElement(By.xpath("//input[@type='submit']"));
		Login.click();
		
		Thread.sleep(3000);
		
		drivers.navigate().back();
			
//		recurring payments
		WebElement RecurringPayments = drivers.findElement(By.xpath("//a[text()='Recurring payments']"));
		RecurringPayments.click();
		
		Thread.sleep(2000);
		drivers.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		
		drivers.findElement(By.xpath("(//a[contains(text(),'My ')])[1]"));
		
		drivers.navigate().back();
		
		WebElement Desktop = drivers.findElement(By.xpath("(//a[contains(@data-toggle,'dropdown')])[1]"));
		Desktop.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
