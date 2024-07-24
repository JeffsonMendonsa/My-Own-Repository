package org.openqa.selenium.chrome;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
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

import com.google.common.io.Files;

import Utility.CaptureScreen;

public class IFrames  {

	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		
		
		WebElement Frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(Frame4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("1st switch Successful");
		System.out.println("Frame 4 done");
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		WebElement Frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(Frame1);
		
		driver.findElement(By.xpath("//form[@name='name1']//input[@type='text']")).sendKeys("2nd switch Successful");
		System.out.println("Frame 1 done");
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		WebElement Frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(Frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("3rd switch Successful");
		System.out.println("Frame 2 done");
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		WebElement Frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(Frame3);
		
		WebElement innerFrame3 = driver.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com')]"));
		driver.switchTo().frame(innerFrame3);
		
		WebElement iAmHuman = driver.findElement(By.xpath("//span[text()='I am a human']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",iAmHuman);
		Thread.sleep(2000);
		iAmHuman.click();
		System.out.println("Frame 3 done");
		System.out.println();
		Thread.sleep(2000);
		
		WebElement General = driver.findElement(By.xpath("//span[text()='General Web Automation']")); Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();",General);
		Thread.sleep(2000);
		General.click();
		
		driver.findElement(By.xpath("//span[text()='Choose']")).click(); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Well, now I know :-)'])[2]")).click();
		
//		WebElement Next = driver.findElement(By.xpath("//span[text()='Next']"));
		List<WebElement> NextList = driver.findElements(By.xpath("//span[text()='Net']"));
		
		int NextListSize = NextList.size();
		System.out.println("Size of the NextList is: " + NextListSize);
		
		if(NextListSize > 0)
		{
			NextList.get(0).click();
		}
		else
		{
			TakesScreenshot NextSS = (TakesScreenshot)driver;
			File SSCapture = NextSS.getScreenshotAs(OutputType.FILE);
			File NextPath = new File("C:\\Jeffson\\Testing\\Test Screenshots\\Next PP test.jpeg");
			Files.copy(SSCapture, NextPath);
		}
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
//		WebElement LastOne = driver.findElement(By.xpath("//input[name='mytext3']"));
		List<WebElement> ListOfLastOne = driver.findElements(By.xpath("//input[name='mytext3']"));
		int SizeOfList = ListOfLastOne.size();
		System.out.println("Size of the last list is: " + SizeOfList);
	
		
		if(SizeOfList > 0)
		{
			ListOfLastOne.get(0).click();
		}
		else
		{
			TakesScreenshot screen = (TakesScreenshot)driver;
		  	 File TakeSS = screen.getScreenshotAs(OutputType.FILE);
		  	 File Path = new File("C:\\Jeffson\\Testing\\Test Screenshots\\First Tests SS.png");
		  	 Files.copy(TakeSS, Path);
		}
		
		
		 
		ZonedDateTime Dt = ZonedDateTime.now();
		DateTimeFormatter TimeFormatter = DateTimeFormatter.ofPattern("dd_momo_yyyy_hh_mm_ss");
		String DateTime = Dt.format(TimeFormatter);
		
		CaptureScreen.ScreenshotMethod(driver, "TestSceenA" + DateTime);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
