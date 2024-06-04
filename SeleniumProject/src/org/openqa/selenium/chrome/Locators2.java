package org.openqa.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		Username.sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button-')]")).click();	//login button
		
//		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();	//forgot pass button
		
//		driver.findElement(By.xpath("(//span[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name')])[6]")).click();
		driver.findElement(By.linkText("Time")).click();
	
//		driver.findElement(By.xpath("//button[@title='My Timesheet']")).click();
		
//		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();

//		input[@placeholder='First Name']
		
//		driver.findElement(By.className("oxd-icon")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
