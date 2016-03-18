package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	public static void main(String[] a){
		driverInit();
		
	}
	
	static public void driverInit(){
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gooogle.com");
	}

}
