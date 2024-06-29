package org.openqa.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
//		https://demo.guru99.com/test/simple_context_menu.html		double click site    
		//a[text()='Desktops']
		
//		WebElement RightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//		Thread.sleep(4000);
		Actions test = new Actions (driver);
//		test.contextClick(RightClick).perform();
		
//		WebElement DoubleClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
//		test.doubleClick(DoubleClick).perform(); 
		
		WebElement Hover = driver.findElement(By.xpath("//a[text()='Desktops']"));
		test.moveToElement(Hover).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
		
		WebElement TabFunc = driver.findElement(By.xpath("//input[@class='form-control input-lg']"));
		
		TabFunc.sendKeys("Samsung");
		Thread.sleep(3000);
		test.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//		test.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Jeffson");
		Thread.sleep(2000);
		test.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
		
//		driver.findElement(By.xpath("//input[@id='input-lastname']")).click();
		test.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
		}

}
