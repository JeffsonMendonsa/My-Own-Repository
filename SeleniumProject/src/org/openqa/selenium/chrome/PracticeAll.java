package org.openqa.selenium.chrome;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v121.emulation.model.SensorMetadata;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import Utility.CaptureScreen;

public class PracticeAll {
	
	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Jeff");
		
		act.sendKeys(Keys.TAB).sendKeys("Mend").sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys("jeffsonmendonsa@538.com").sendKeys(Keys.TAB).sendKeys("123456")
		.sendKeys(Keys.TAB).sendKeys("Pass@123").sendKeys(Keys.TAB).sendKeys("Pass@123")
		.build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();
		
		
		ZonedDateTime dt = ZonedDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd_MM_YYYY_hh_mm_ss");
		 String Formatter = dt.format(format);
	
		 System.out.println("The Time now is: " + Formatter);
		 
		 List<WebElement> Continue = driver.findElements(By.xpath("//input[@tye='submit']"));
			int sizeElements = Continue.size();
			
			System.out.println("Size of elements is: " + sizeElements);
			
			if(sizeElements > 0)
				Continue.get(0).click();
			else
			{
			
			TakesScreenshot ss = (TakesScreenshot)driver;
			File ss1 = ss.getScreenshotAs(OutputType.FILE);
			File Path = new File("C:\\Jeffson\\Testing\\Test Screenshots\\.PRACALL" + Formatter + ".png");
			Files.copy(ss1, Path);
			}
		 
		 
	}
	
	

}
