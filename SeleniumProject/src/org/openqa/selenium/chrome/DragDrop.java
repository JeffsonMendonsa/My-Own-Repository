package org.openqa.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		WebElement Drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop = driver.findElement(By.xpath("//div[@class='simple-drop-container']//div[@class='drop-box ui-droppable']"));
		
		Actions exx = new Actions (driver);
		Thread.sleep(4000);
		
		exx.clickAndHold(Drag).perform();
		exx.moveToElement(Drop).click().build().perform();
		
		
		

		
	}

}
