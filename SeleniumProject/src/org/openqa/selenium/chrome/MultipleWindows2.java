package org.openqa.selenium.chrome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindows2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
//		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + ParentWindow);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
