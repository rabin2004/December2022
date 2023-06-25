package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupTest {

	public static void main(String[] args) throws InterruptedException {
		
		// Pre-requisite:
		// 1. Set system property -> which browser? | browser specific driver location?
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe"); // windows -> E:\\Drivers\\chromediver.exe | mac -> /Drivers/chromedriver
		// 2. Creating instance of webDriver -> point to parent WebDriver
		WebDriver driver = new ChromeDriver();
		
		// maximize browser
		driver.manage().window().maximize();
		
		// 3. load app
		driver.get("https://www.macys.com/");
		
		// Test script: - test automation scripts
		
		Thread.sleep(3000);
		// Post-requisite:
		driver.quit();
	}

}
