package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingVariousElements {
	static String invalidEmailAddress = "test@gmail.com";
	static String invalidPassword = "test123";

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		//Negative login functionality test
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		accountList.click();
		
		WebElement signInpageHeader = driver.findElement(By.cssSelector("#authportal-main-section > "
				+ "div:nth-child(2) > div > div.a-section > form > div > div > div > h1"));
		
		if(signInpageHeader.isDisplayed()) {
			WebElement emailAddressTxtBox = driver.findElement(By.name("email"));
			emailAddressTxtBox.sendKeys(invalidEmailAddress);
			WebElement continueBtn = driver.findElement(By.className("a-button-input"));
			continueBtn.click();
			WebElement emailAddressHeaderWebElement = driver.findElement(By.
					xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/div/div/span"));
			String emailAddresssHeaderTxt = emailAddressHeaderWebElement.getText();
			if(invalidEmailAddress.equals(emailAddresssHeaderTxt)) {
				WebElement passwordTxtBox = driver.findElement(By.name("password"));
				passwordTxtBox.sendKeys(invalidPassword);
				WebElement signInBtn = driver.findElement(By.id("signInSubmit"));
				signInBtn.click();
				WebElement loginErrorMsg = driver.findElement(By.id("auth-warning-message-box"));
				if(loginErrorMsg.isDisplayed()) {
					System.out.println("Negative Login functionality test: Passed");
				}else {
					System.err.println("Negative Login functionality test: Failed");
				}
			}else {
				System.err.println("Negative Login functionality test "
						+ "(Not displaying email address entered): Failed");
			}
		}else {
			System.err.println("Negative Login functionality test (Not in sign-in page): Failed");
		}
		
		driver.quit();
	}

}
