package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {
	// Synchronization: automation execution speed Vs application/element load time
	
		// 1. Static Wait: - pause execution
				// Thread.sleep(5000);
	
		// 2. Dynamic Wait: - pause execution until elements is available
				// a. Implicit wait: - global wait -> implicitlyWait()
	
				// b. Explicit wait: - define for a specific element -> WebDriverWait class
	
				// c. Fluent Wait: - like explicit wait in addition frequency of search/polling can be defined -> FluentWait class
		
		// PageLoadTimeout: duration app takes to load page
	
	WebDriver driver;
	Properties prop;
	
	SynchronizationConcept(){
		try {
			// 1. Create instance of Properties class
			prop = new Properties();
			
			// 2. Read config file -> FileInputStream class -> need common IOs jar files in the project
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\eclipse-workspace"
					+ "\\December2022Batch\\src\\seleniumBasics\\config.properties"));
			
			// 3. Load whatever read from config file into Properties class instance
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	void initialization() {
		// Cross browser testing
		String browserName = prop.getProperty("browser");
		
		switch(browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.err.println(browserName+": Browser is not supported");
		}

		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(prop.getProperty("testURL"));
		
		// pageLoadTimeOut
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // TimeoutException: timeout: Timed out receiving message from renderer: 0.001
	}
	
	void tearDown() {
		driver.quit();
	}
	
	void positiveTestOfLinksUnderAccountListDropDown() {
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(25));
		
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		explicitWait.until(ExpectedConditions.visibilityOf(accountList));
		
		Actions action = new Actions(driver);

		action.moveToElement(accountList).build().perform();
	
		String link = prop.getProperty("dynamicDropDownLinkToTest");
		WebElement linktoBeClicked = driver.findElement(By.linkText(link));
//		explicitWait.until(ExpectedConditions.invisibilityOf(linktoBeClicked)); // TimeoutException: Expected condition failed: waiting for invisibility of [[ChromeDriver: chrome on windows (00bfbfaeb971f074a12ed2693b726b1a)] -> link text: Create a List] (tried for 25 second(s) with 500 milliseconds interval)
		
		FluentWait<WebDriver> fl = new FluentWait<WebDriver>(driver)
							.withTimeout(Duration.ofSeconds(25))
							.pollingEvery(Duration.ofSeconds(5))
							.ignoring(NoSuchElementException.class);
		
		fl.until(ExpectedConditions.invisibilityOf(linktoBeClicked)); // TimeoutException: Expected condition failed: waiting for invisibility of [[ChromeDriver: chrome on windows (649eb59e3b2157755305736a4f7fa21b)] -> link text: Create a List] (tried for 25 second(s) with 5000 milliseconds interval)
		
		action.moveToElement(linktoBeClicked).build().perform();
		action.click().build().perform();
		
		String actualCreateListPageTitle = driver.getTitle();
		String expectedCreateListPageTitle = prop.getProperty("expectedLinkPageTitle");
		if(actualCreateListPageTitle.equals(expectedCreateListPageTitle)) {
			System.out.println(link+" Link testing: Passed");
		}else {
			System.err.println(link+" Link testing: Failed");
		}
	}

	public static void main(String[] args) {
		SynchronizationConcept sc = new SynchronizationConcept();
		sc.initialization();
		sc.positiveTestOfLinksUnderAccountListDropDown();
		sc.tearDown();

	}

}
