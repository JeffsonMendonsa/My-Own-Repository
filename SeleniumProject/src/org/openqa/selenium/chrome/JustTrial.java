package org.openqa.selenium.chrome;

import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v121.emulation.model.SensorMetadata;
import org.openqa.selenium.interactions.Actions;

public class JustTrial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Actions func = new Actions(driver);
		
		driver.get("https://magento.softwaretestingboard.com/checkout/cart/#shipping");
		
//		WebElement CrAcc = driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]"));
//		CrAcc.click();
//		
//		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Jeff");
//		func.sendKeys(Keys.TAB).sendKeys("Mendonsa").sendKeys(Keys.TAB).sendKeys("jeffsonmendonsa385@gmail.com").build().perform();
//		
//		func.sendKeys(Keys.TAB).sendKeys("Testing@1234").sendKeys(Keys.TAB).sendKeys("Testing@1234").build().perform();
//		
//		func.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		

		driver.findElement(By.xpath("(//a[contains(@href,'https://magento.softwaretestingboard.com/customer/account/l')])[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("jeffsonmendonsa385@gmail.com");
		
		func.sendKeys(Keys.TAB).sendKeys("Testing@1234").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		WebElement Men = driver.findElement(By.xpath("//a[@id='ui-id-5']"));
		
		func.moveToElement(Men).perform();
		
		List<WebElement> MenAll = driver.findElements(By.xpath("\"//a[@id='ui-id-5']\""));
		
		
//		for(WebElement EveryEl : MenAll)
//		{
//			String tops = EveryEl.getText();
//			System.out.println(tops);
//			
//			if(tops.equals("Tops"))
//			{
//				EveryEl.click();
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
