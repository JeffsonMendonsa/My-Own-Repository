package org.openqa.selenium.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v121.emulation.model.SensorMetadata;
import org.openqa.selenium.interactions.Actions;

public class DropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);

		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		driver.findElement(By.xpath("//select//option[@value='AFG']")).click();
		
//		WebElement
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
