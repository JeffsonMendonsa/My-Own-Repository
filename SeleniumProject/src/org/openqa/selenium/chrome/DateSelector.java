package org.openqa.selenium.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DateSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		Thread.sleep(500);
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		Thread.sleep(500);
		
		WebElement Datepicker = driver.findElement(By.xpath("//input[@id='datepicker1']"));
		Datepicker.click();
		
//		WebElement Trialdate = driver.findElement(By.xpath("//a[text()='25']"));
//		Trialdate.click();
		
		int day = 1;
		
		while(day==1)
		{
			WebElement Previous = driver.findElement(By.xpath("//a[@title='Prev']"));
//			Previous.click();
			WebElement MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
//			String MonthYearText = MonthYear.getText();
			
			if(!MonthYear.getText().equals("November 2020"))
				Previous.click();
			else
				
			{
				break;
			}
			
			
			
			
		}
		
		
		WebElement Trialdate = driver.findElement(By.xpath("//a[text()='24']"));
		Trialdate.click();
		
//		------------------------------------------------------------
		
		WebElement SecCalender = driver.findElement(By.xpath("//input[@id='datepicker2']"));
		SecCalender.click();
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Change the month']"));
		Select selMonth = new Select(Month);
		selMonth.selectByIndex(10);
		
//		WebElement Year = driver.findElement(By.xpath("//select[@title='Change the year']"));
//		Select selYear = new Select(Year);
//		selYear.selectByVisibleText("1996");
		
		List<WebElement> AllYears = driver.findElements(By.xpath("//select[@title='Change the year']//option"));
		
		WebElement OneYear = driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[2]"));
		 OneYear.click();
		

		for(WebElement SelectYears : AllYears)
		{
			String reqYear = SelectYears.getText();
			System.out.println(reqYear);
			
		if(reqYear.equals("1996"))
		{
			SelectYears.click();
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
