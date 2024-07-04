package org.openqa.selenium.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v121.emulation.model.SensorMetadata;
import org.openqa.selenium.interactions.Actions;

public class IFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		
		WebElement Frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(Frame4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("1st switch Successful");
		System.out.println("1st Iframe done");
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		WebElement Frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(Frame1);
		
		driver.findElement(By.xpath("//form[@name='name1']//input[@type='text']")).sendKeys("2nd switch Successful");
		System.out.println("2nd Iframe done");
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		WebElement Frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(Frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("3rd switch Successful");
		System.out.println("3rd Iframe done");
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		
		WebElement Frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(Frame3);
		
		WebElement innerFrame3 = driver.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com')]"));
		driver.switchTo().frame(innerFrame3);
		
		WebElement iAmHuman = driver.findElement(By.xpath("//span[text()='I am a human']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",iAmHuman);
		Thread.sleep(3000);
		iAmHuman.click();
		System.out.println("4th Iframe done");
		Thread.sleep(2000);
		
		WebElement General = driver.findElement(By.xpath("//span[text()='General Web Automation']")); Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();",General);
		General.click();
		
		driver.findElement(By.xpath("//span[text()='Choose']")).click(); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Well, now I know :-)'])[2]")).click();
		
		WebElement Next = driver.findElement(By.xpath("//span[text()='Next']"));
		Next.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
