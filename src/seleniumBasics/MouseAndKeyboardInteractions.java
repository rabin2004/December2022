package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardInteractions {
	
	WebDriver driver;
	
	MouseAndKeyboardInteractions() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void tearDown() {
		driver.quit();
	}
	
	// Mouse & Keyboard interaction -> Actions class
			// Steps: 1. identify element	| 2. define action/s	| 3. build().perform()
	
	void mouseOperation() throws InterruptedException {
		driver.get("https://www.amazon.com");
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		
		Thread.sleep(4000);
		action.moveToElement(accountList).build().perform();
		Thread.sleep(4000);
		String link = "Create a List";
		WebElement linktoBeClicked = driver.findElement(By.linkText(link));
		action.moveToElement(linktoBeClicked).build().perform();
		Thread.sleep(4000);
		action.click().build().perform();
		
		String actualCreateListPageTitle = driver.getTitle();
		String expectedCreateListPageTitle = "Your List";
		if(actualCreateListPageTitle.equals(expectedCreateListPageTitle)) {
			System.out.println(link+" Link testing: Passed");
		}else {
			System.err.println(link+" Link testing: Failed");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MouseAndKeyboardInteractions hak = new MouseAndKeyboardInteractions();
		hak.mouseOperation();
		hak.tearDown();

	}
	// Assignment: Handling group of elements/web table/Calendar/trying some mouse operations
}
