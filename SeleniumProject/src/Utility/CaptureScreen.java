package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreen {
	
	public static void ScreenshotMethod(WebDriver driver, String FileName) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver;
	  	 File TakeSS = screen.getScreenshotAs(OutputType.FILE);
	  	 File Path = new File("C:\\Jeffson\\Testing\\Test Screenshots\\ " +  FileName + ".png");
	  	 Files.copy(TakeSS, Path);
	}

}
