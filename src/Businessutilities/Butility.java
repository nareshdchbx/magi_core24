package Businessutilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import java.nio.file.Files;

public class Butility {
	
	
	public static void takescreenshot(WebDriver driver) throws IOException
	{
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
          FileUtils.copyFile(scrFile, new File("C:\\Users\\Chinna\\Downloads\\vf6.png"));	
		
	}

}
