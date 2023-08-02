package seleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;

public class HandlingConfigFileAndTakingScreenshots {
	WebDriver driver;
	Properties prop;
	
	HandlingConfigFileAndTakingScreenshots(){
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
		driver.get(prop.getProperty("testURL"));
	}
	
	void tearDown() {
		driver.quit();
	}
	
	void positiveTestOfLinksUnderAccountListDropDown() {
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);

		action.moveToElement(accountList).build().perform();
		
		// Taking screenshot: -> getSreesnshotAs() -> outputs a file -> copy file to picture file
		// taking screenshot of the screen/page:
		try {
			File pageScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(pageScreenshot, new File("C:\\Users\\User\\eclipse-workspace"
					+ "\\December2022Batch\\src\\seleniumBasics\\pageScreenshot.png"));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String link = prop.getProperty("dynamicDropDownLinkToTest");
		WebElement linktoBeClicked = driver.findElement(By.linkText(link));
		action.moveToElement(linktoBeClicked).build().perform();
		action.click().build().perform();
		
		String actualCreateListPageTitle = driver.getTitle();
		String expectedCreateListPageTitle = prop.getProperty("expectedLinkPageTitle");
		if(actualCreateListPageTitle.equals(expectedCreateListPageTitle)) {
			System.out.println(link+" Link testing: Passed");
			try {
				File pageScreenshotOfLinkPage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(pageScreenshotOfLinkPage, new File("C:\\Users\\User\\eclipse-workspace"
						+ "\\December2022Batch\\src\\seleniumBasics\\pageScreenshotOfLinkPage.png"));
				
				// Taking screenshot of the element:
				WebElement yourListLinkElement = driver.findElement(By.id("my-lists-tab"));
				File yourListLink = yourListLinkElement.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(yourListLink, new File("C:\\Users\\User\\eclipse-workspace"
						+ "\\December2022Batch\\src\\seleniumBasics\\yourListLink.png"));
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.err.println(link+" Link testing: Failed");
		}
	}

	public static void main(String[] args) {
		HandlingConfigFileAndTakingScreenshots hcf = new HandlingConfigFileAndTakingScreenshots();
		hcf.initialization();
		hcf.positiveTestOfLinksUnderAccountListDropDown();
		hcf.tearDown();

	}
	// Assignment: 1. Try mouse keyboard operation - drag & drop 2. Use config file and handle config data separately 3. Integrate taking screenshot if test case fails 4. Pick any app and try using knowledge learned so for few features
}
