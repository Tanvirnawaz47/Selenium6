package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {

	//System.setProperty(" webDriver.chrome.driver", "C:\\Users\\tanvi\\eclipse-workspace3\\Selenium_First_Class\\Drivers\\chromedriver.exee");
		System.setProperty(" webDriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.dev/downloads/");	
		driver.close();
		driver.quit();
		
	}
	
	
	
	
	
}
