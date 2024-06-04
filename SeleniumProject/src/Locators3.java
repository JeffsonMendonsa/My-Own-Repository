import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.91wheels.com/scooters/under-70-thousand");
		
//		WebElement SearchBrands = driver.findElement(By.id("searchbrands"));
//		SearchBrands.sendKeys("Royal Enfield");
		
//		driver.findElement(By.xpath("(//span[@class='leading-6 text-sm lg:text-base flex justify-start gap-x-0  font-semibold uppercase py-3 pt-4  group-hover:text-primary hover:text-primary cursor-pointer items-center text-slate-900  '])[2]"));		
		
		driver.findElement(By.id("global_search_desktop")).sendKeys("Royal Enfield Classic 350");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='search_global']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Classic 350 Specs']")).click();
//		driver.findElement(By.id("main_cta_button")).click();
		
		driver.findElement(By.xpath("//div[text()='Dark Series Dual Channel']")).click();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
