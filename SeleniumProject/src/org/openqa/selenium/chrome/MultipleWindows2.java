package org.openqa.selenium.chrome;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindows2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int id = 1;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
//		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + ParentWindow);
		System.out.println("**********************");
		
		Set<String> AllWindows = driver.getWindowHandles();
		int NumOfWindows = AllWindows.size();
		
//		for(String SingleWindow : AllWindows)
//		{
////			if(!(SingleWindow.equals(ParentWindow)))
//			{
////				driver.switchTo().window(SingleWindow);
//				System.out.println("Window " + id++ + ": " +SingleWindow);
//				
//			}
//		}
		
//		ArrayList<String>Wins = new ArrayList<String>(AllWindows);
////		driver.switchTo().window(Wins.get(1));
//		int we = 0;
//		
//		for(String each : Wins)
//		{
//			driver.switchTo().window(each);
//			Thread.sleep(3000);
//			System.out.println("Window " + id++ + ": " +each);
//			if(we==0)
//			{
//				we++; 
//				continue;
//			}
//			driver.findElement(By.xpath("//*[@id='Form_submitForm_EmailHomePage']")).sendKeys("Test" + we++);
//			Thread.sleep(3000);
//		}
			
		String [] StringWin = new String[5];
		System.out.println(StringWin[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
