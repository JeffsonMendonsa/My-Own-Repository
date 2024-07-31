package org.openqa.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		Actions test = new Actions(driver);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
