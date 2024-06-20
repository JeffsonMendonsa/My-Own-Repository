package org.openqa.selenium.chrome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		int abc = 1;
//		
//		String ParentWindow = driver.getWindowHandle();
//		System.out.println("Parent Window: " + ParentWindow);
//		System.out.println();
//		System.out.println("*****************************");
//		System.out.println();
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
//		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
//		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
//		
//		Set<String> AllWindows = driver.getWindowHandles();
//		
//		for(String SingleWindow : AllWindows)
//		{
//			if(!(SingleWindow.equals(ParentWindow)))
//			{
//				driver.switchTo().window(SingleWindow);
//				System.out.println("Window" + abc+  ": " +  SingleWindow);
//				abc++;
//			}
//		}
		
		
//		ArrayList<String> ArrayWindows = new ArrayList<String>(AllWindows);
////		ArrayWindows.get(1);
//		driver.switchTo().window(ArrayWindows.get(1));
//		driver.findElement(By.xpath("(//button[@class='btn btn-ohrm btn-free-demo'])[2]")).click();
		int win = 1;
		WebDriver drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		
		drivers.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String ParentWindow = drivers.getWindowHandle();
		System.out.println("Parent Window:- " + ParentWindow);
		System.out.println("*******************");
		
		Thread.sleep(4000);
		
		drivers.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		drivers.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		drivers.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> AllWindows = drivers.getWindowHandles();
//		System.out.println("All Windows:- "  + AllWindows);
		
		for(String SingleWindow : AllWindows)
		{
			System.out.println("Window " + win++ +":- " + SingleWindow);
		}
		
		
		
		
	
		
		
		
		
		
		
		
	}
	
}
