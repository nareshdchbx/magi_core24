package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class BaseClass{
	
	public WebDriver driver;
	public WebDriver getdriver()
	{
		String bname="chrome";
		bname=bname.toLowerCase();
	
		switch (bname) {
		case "ff":
			driver=new FirefoxDriver();
			break;
		
			
		case "chrome":
			// Set path for Chrome Driver executable
			 System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	        
	        // Launch ChromeDriver
	        driver = new ChromeDriver();
			break;
		case "ie":
			// Set path for Internet Explorer Driver executable
	        System.setProperty("webdriver.ie.driver", "C:\\Users\\Saketh\\Downloads\\Selenium\\IEDriverServer32.exe");
	        
	        // Launch InternetExplorerDriver
	        driver = new InternetExplorerDriver();
			break;
			
		case "phantom":
			DesiredCapabilities capability = new DesiredCapabilities();  
			  capability.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Users\\Saketh\\Downloads\\phantomjs-2.0.0-windows\\phantomjs-2.0.0-windows\\bin\\phantomjs.exe");
			  driver = new PhantomJSDriver(capability);
			  break;
			  
		case "html":
			
			driver=new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_11);
				break;
			

		default:
			System.out.println("Please provide proper input");
			break;
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://54.211.186.73/#/application");
		return driver;
		
	}

}
