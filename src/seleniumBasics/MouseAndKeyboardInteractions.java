package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	void mouseAndkeyboardOperation() throws InterruptedException {
		driver.get("https://www.amazon.com");
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		Actions action = new Actions(driver);
		Thread.sleep(4000);
		action.moveToElement(searchTxtBox).build().perform();
		Thread.sleep(4000);
		action.click().build().perform();
		Thread.sleep(4000);
		String product1 = "apple";
		action.sendKeys(product1).build().perform();
		Thread.sleep(4000);
		action.doubleClick().build().perform();
		Thread.sleep(4000);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(4000);
		String product2 = "samsung";
		action.sendKeys(product2).build().perform();
		Thread.sleep(4000);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		String actualSearchResultPageTitle = driver.getTitle();
		String expectedSearchResultPageTitle = "Amazon.com : "+product2;
		if(actualSearchResultPageTitle.equals(expectedSearchResultPageTitle)) {
			System.out.println("Search funtionality with mouse & Keyboard operation: Passed");
		}else {
			System.err.println("Search funtionality with mouse & Keyboard operation: Failed");
		}
	}
	
	void dragAndDropOperation() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/drag_drop.html");	
		Actions action = new Actions(driver);
		WebElement first5000DragElement = driver.findElement(By.
				cssSelector("#products>div>ul>li:nth-child(2)>a"));
		WebElement second5000DragElement = driver.findElement(By.
				cssSelector("#products>div>ul>li:nth-child(4)>a"));
		WebElement bankDragElement = driver.findElement(By.
				cssSelector("#credit2>a"));
		WebElement salesDragElement = driver.findElement(By.
				cssSelector("#credit1>a"));
		
		WebElement drop1 = driver.findElement(By.id("bank"));
		WebElement drop2 = driver.findElement(By.id("amt7"));
		WebElement drop3 = driver.findElement(By.id("loan"));
		WebElement drop4 = driver.findElement(By.id("amt8"));
		
		Thread.sleep(4000);
		// #1
		action.dragAndDrop(bankDragElement, drop1).build().perform();
		Thread.sleep(4000);
		
		// #2
		action.moveToElement(first5000DragElement).build().perform();
		Thread.sleep(4000);
		action.clickAndHold().build().perform();
		Thread.sleep(4000);
		action.moveToElement(drop2).build().perform();
		Thread.sleep(4000);
		action.release().build().perform();
		Thread.sleep(4000);
		
		// #3
		action.clickAndHold(salesDragElement).build().perform();
		Thread.sleep(4000);
		action.release(drop3).build().perform();
		Thread.sleep(4000);
		
		// #4
		action.clickAndHold(second5000DragElement).release(drop4).build().perform();
		Thread.sleep(4000);
		
		WebElement dragDropPerfectMsg = driver.findElement(By.
				cssSelector("#equal[class='table4_result']>a"));
		
		if(dragDropPerfectMsg.isDisplayed()) {
			System.out.println("Drag & Drop operation: Passed");
		}else {
			System.err.println("Drag & Drop operation: Failed");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MouseAndKeyboardInteractions hak = new MouseAndKeyboardInteractions();
//		hak.mouseOperation();
//		hak.mouseAndkeyboardOperation();
		hak.dragAndDropOperation();
		hak.tearDown();

	}
	// Assignment: Handling group of elements/web table/Calendar/trying some mouse operations
}
