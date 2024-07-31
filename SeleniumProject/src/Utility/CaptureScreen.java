package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

import com.google.common.io.Files;

public class CaptureScreen {
	
	public static void ScreenshotMethod(WebDriver driver, String FileName) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver;
	  	 File TakeSS = screen.getScreenshotAs(OutputType.FILE);
	  	 File Path = new File("C:\\Jeffson\\Testing\\Test Screenshots\\ " +  FileName + ".png");
	  	 Files.copy(TakeSS, Path);
	}

	public static void ScrollJS(WebDriver driver, WebElement iamHuman)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView();", iamHuman);
		
		
	}
	
	
	
	
	
	
}
