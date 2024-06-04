package org.openqa.selenium.chrome;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class BrowserTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
//		ChromeDriver driver = new ChromeDriver();
		
		String browserName = "Chrome";
		WebDriver drivers;
		drivers = new ChromeDriver();
		
		
//		if(browserName.equals("Chrome"))
//		{
//		 drivers = new ChromeDriver();
//		}
//		else
//		{
//			 drivers = new EdgeDriver();
//		}
		
	
		drivers.manage().window().maximize();
		drivers.get("https://amazon.com");
		
		drivers.navigate().to("https://facebook.com");
		
//		Thread.sleep(10000);
		drivers.navigate().refresh();
		
		drivers.navigate().back();
		
		String TitleName = drivers.getTitle();
		System.out.println(TitleName);
		
		drivers.navigate().to("https://amazon.com");
		
		String CurrentURL = drivers.getCurrentUrl();
		System.out.println(CurrentURL);
		
		if(TitleName.contains(".com "))
		{
			System.out.println("Test case for the Title passed");
		}
		else
		{
			System.out.println("Test case for the Title failed");
		}
		
		
		
//		WebDriver drivers = new ChromeDriver();
		
//		drivers = new EdgeDriver();
//		
//		EdgeDriver driver1 = new EdgeDriver();
		
//		GeckoDriverInfo driver2 = new GeckoDriverInfo();
		
		
				
		
		
	}

}
