package org.openqa.selenium.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FBDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		WebElement FirstName = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		FirstName.sendKeys("Jeff");
		
		WebElement LastName = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
		LastName.sendKeys("Mendonsa");
		
		WebElement EmailAddress = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		EmailAddress.sendKeys("jeff123@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		Password.sendKeys("Test@123");
		
		
		List<WebElement> AllDates = driver.findElements(By.xpath("//select[@id='day']//option"));
		
		
		WebElement Dates = driver.findElement(By.xpath("//select[@id='month']"));
		Dates.click();
		
		for( WebElement day : AllDates )
		{
			String reqDate = day.getText();
			System.out.println(reqDate);
			
			if(reqDate.equals("24"))
			{
				day.click();
			}
			
		}
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select SelectMonth = new Select(Month);
		SelectMonth.selectByIndex(10);
		
		System.out.println("Option Selected");
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select SelectYear = new Select(Year);
		SelectYear.selectByValue("1996");
		
//		WebElement NewYear = driver.findElement(By.xpath("//select[@id='year']"));
//		Select SelectNewYear = new Select(NewYear);
//		SelectNewYear.selectByVisibleText("2000");
		
		WebElement Male = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		Male.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();	
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		WebElement AlreAcc = driver.findElement(By.xpath("//a[text()='Already have an account?']"));
		AlreAcc.click();
		
		WebElement ForgAcc = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		ForgAcc.click();
		
		
		
		
		
		
		
		
		
		
	}

}
