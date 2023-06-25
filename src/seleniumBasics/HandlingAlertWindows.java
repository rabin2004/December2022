package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertWindows {
	
	WebDriver driver;
	
	HandlingAlertWindows() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void closeApp() {
		driver.quit(); // quit() -> close all the windows opened by the browser instance
	}
	
	void handlingAlert() throws InterruptedException { // alert/java alert/pop-up/java pop-up -> to handle switchTo().alert() -> 1. get text | 2. accept | 3. deny
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement customerID = driver.findElement(By.name("cusid"));
		customerID.sendKeys("test12");
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		
		// without handling alert -> UnhandledAlertException: unexpected alert open: {Alert text : Do you really want to delete this Customer?}
//		WebElement resetBtn = driver.findElement(By.name("res"));
//		resetBtn.click();
		
		String expectedAlertMsg1 = "Do you really want to delete this Customer?";
		String expectedAlertMsg2 = "Customer Successfully Delete!";
		String actualAlertMsg1 = driver.switchTo().alert().getText();
		if(actualAlertMsg1.equals(expectedAlertMsg1)) {
			Thread.sleep(3000);
//			driver.switchTo().alert().accept();
			driver.switchTo().alert().dismiss(); // if not alert -> NoAlertPresentException: no such alert 
			System.out.println("Handled 1st alert");
			String actualAlertMsg2 = driver.switchTo().alert().getText();
			if(actualAlertMsg2.equals(expectedAlertMsg2)) {
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				System.out.println("Handled 2nd alert");
			}else {
				System.err.println("Unable to handle 2nd alert");
			}
		}else {
			System.err.println("Unable to handle 1st alert");
		}
		// after handling alert
		WebElement resetBtn = driver.findElement(By.name("res"));
		resetBtn.click();
	}
	
	void handlingWindows() throws InterruptedException { // multiple windows -> switchTo().window(handle) -> getWindowHandle() - window focus | getWindowHandles()
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
//		System.out.println(driver.getTitle());
		clickHereLink.click();
//		System.out.println(driver.getTitle());
		clickHereLink.click();
//		System.out.println(driver.getTitle());
		
//		System.out.println("Parent window handle: "+driver.getWindowHandle());
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Number of windows opened: "+handles.size());
		
		for(String handle: handles) {
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			System.out.println("Validating window handle: "+driver.getWindowHandle().equals(handle));
			Thread.sleep(3000);
			driver.close(); // close() -> will only close window controlled by driver
		}
	}

	public static void main(String[] args) throws InterruptedException {
		HandlingAlertWindows haw = new HandlingAlertWindows();
//		haw.handlingAlert();
		haw.handlingWindows();
		haw.closeApp();

	}
	// Assignment: 1. Demo app -> flight booking & registration | 2. all the topics | 3. Any app - 3-4 features and create multiple automation test scenarios


}
