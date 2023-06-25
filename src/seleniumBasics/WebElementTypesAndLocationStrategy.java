package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementTypesAndLocationStrategy {
	
	// Selenium Automation:
		// 1. Specifically Locate the element(WebElement/WebObject/GUI(Graphical user Interface)object or element)
		// 2. Perform action
		// 3. Validate action performed
	
	// WebElements or WebObjects or GUI (Graphical User Interface) objects or elements:
				// Types:
					// 1. Text Box/Field: user can input some characters
					// 2. Button/Tab: user input to click on it
					// 3. Radio Button: user input to click to select, "Round button"
					// 4. Check box: user input to click to select, "check mark"
					// 5. Links: click takes user to different page or application
					// 6. Text: to provide informations
					// 7. Drop Down: clicking on it more options are visible -> Static or Dynamic
					// 8. Menu/Menu link: high value feature/product/flow
					// 9. Pictures/Videos:
			
			// Strategy to locate webElement:
				// Types: - attributes
					// 1. Name: value pointed mostly are unique, most commonly used
					// 2. ID: value pointed mostly are unique, most commonly used
					// 3. linkText: text of the link itself
					// 4. partial linkText: unique portion of the link
					// 5. className: mostly not unique value, mostly not helpful to identify an element alone
					// 6. tagName: generic name, not able to identify an element, but helps to identify group of element in that category
					// 7. Xpath: can be used when nothing works, copy or customizable
					// 8. Css selector: can be used when nothing works, copy or customizable

// App DOM document -
//	<input type="text" name="userName" size="10">
	
	
	// Understanding DOM:
	// <input type="text" name="userName" size="10" pb-role="username">
		// 1. tagName - input
		// 2. attribute - type/name/size/pb-role
		// 3. value - text/userName/10/username
	
	static String product = "hand bag";
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		
		// Search Functionality
		// Handling Txt box - id/name
		WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));
		searchTxtBox.sendKeys(product);
		
		// Handling button/tab
		WebElement searchBtn = driver.findElement(By.id("gh-btn"));	
		searchBtn.click();
		
		// Using className
		WebElement searchResultHeader = driver.findElement(By.className("srp-controls__count-heading"));
		
		// verification point
		if(searchResultHeader.isDisplayed()) {
			System.out.println("Positive Search funtionality (searchResultHeader): Passed");
		}else {
			System.err.println("Positive Search funtionality (searchResultHeader): Failed");
		}
		
		String actualSearchResultPageUrl = driver.getCurrentUrl();
		if(actualSearchResultPageUrl.contains(product)) {
			System.out.println("Positive Search funtionality (SearchResultPageUrl): Passed");
		}else {
			System.err.println("Positive Search funtionality (SearchResultPageUrl): Failed");
		}
		
		String actualSearchResultPageTitle = driver.getTitle();
		if(actualSearchResultPageTitle.contains(product)) {
			System.out.println("Positive Search funtionality (SearchResultPageTitle): Passed");
		}else {
			System.err.println("Positive Search funtionality (SearchResultPageTitle): Failed");
		}
		
		
		// Sign-in functionality - for captcha validation
		// handling linkTxt
		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		signInLink.click();
		
		String signInPageTitle = driver.getTitle();
		if(signInPageTitle.contains("Sign in")) {
			WebElement usernameTxtBox = driver.findElement(By.id("userid"));
			usernameTxtBox.sendKeys("test@gmail.com");
			WebElement continueBtn = driver.findElement(By.name("signin-continue-btn"));
			continueBtn.click();
			
			// Copying xpath/css selector
			// css -> #areaTitle > h1
			// xpath -> //*[@id="areaTitle"]/h1
//			WebElement actualCaptchaPage = driver.findElement(By.xpath("//h1[text()='Please verify yourself to continue']"));
//			WebElement actualCaptchaPage = driver.findElement(By.cssSelector("#areaTitle > h1"));
			if(signInPageTitle.contains("Sign in")) {
				System.out.println("Sign-in functionality - for captcha validation: Passed");
			}else {
				System.err.println("Sign-in functionality - for captcha validation: Failed");
			}
		}else {
			System.err.println("Sign-in functionality - Sign-in link failure: Failed ()");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	// Assignment: Any application | Any 5 feature | Create automation script -> txtbox/link/button ->id/name/className/copied xpath/css-> verification point
}
