package org.openqa.selenium.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v121.emulation.model.SensorMetadata;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);

		driver.get("https://the-internet.herokuapp.com/dropdown");
		
//		WebElement DropButton = driver.findElement(By.id("dropdown"));
//		DropButton.click();
		
//		 List<WebElement> AllDropButtons = driver.findElements(By.xpath("//select[@id='dropdown']//option"));
		 
//		 for(WebElement Single : AllDropButtons)
//		 {
//			 String display = Single.getText();
//			 System.out.println(display);
//			 
//			 if(display.equals("Option 1"))
//			 {
//				 Single.click();
//			 }
//			 
//			 
//		
//			 
//		
//			 
//		 }
		
	
		 WebElement SelOption = driver.findElement(By.xpath("//select[@id='dropdown']"));
		 Select newSelOption = new Select(SelOption);
		 newSelOption.selectByIndex(0);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
