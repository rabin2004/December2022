package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCheckBoxRadioBtnDropDown {
	
	WebDriver driver;
	static String invalidEmailAddress = "test@gmail.com";
	static String invalidPassword = "test123";
	
	HandlingCheckBoxRadioBtnDropDown() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}
	
	void closeApp() {
		driver.quit();
	}
	
	void negativeLoginFunctionalityTest() throws InterruptedException {
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		accountList.click();
		
		WebElement signInpageHeader = driver.findElement(By.
				cssSelector("div[class='a-box-inner a-padding-extra-large']>.a-spacing-small"));
		
		if(signInpageHeader.isDisplayed()) {
			WebElement emailAddressTxtBox = driver.findElement(By.name("email"));
			emailAddressTxtBox.sendKeys(invalidEmailAddress);
			WebElement continueBtn = driver.findElement(By.className("a-button-input"));
			continueBtn.click();
			WebElement emailAddressHeaderWebElement = driver.findElement(By.
					xpath("//*[text()='"+invalidEmailAddress+"']"));
			String emailAddresssHeaderTxt = emailAddressHeaderWebElement.getText();
			if(invalidEmailAddress.equals(emailAddresssHeaderTxt)) {
				WebElement passwordTxtBox = driver.findElement(By.name("password"));
				passwordTxtBox.sendKeys(invalidPassword);
				
				// Handle checkbox
				WebElement rememberMeCheckBx = driver.findElement(By.name("rememberMe"));
				Thread.sleep(3000);
				if(!rememberMeCheckBx.isSelected()) {
					rememberMeCheckBx.click();
					System.out.println("Check box selected now");
				}
				Thread.sleep(3000);
				if(rememberMeCheckBx.isSelected()) {
					rememberMeCheckBx.click();
					System.out.println("Check box is not selected now");
				}
				Thread.sleep(3000);
				
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
	}
	
	void handlingRadioBtn() throws InterruptedException {
		WebElement languageChangeLink = driver.findElement(By.cssSelector("#icp-nav-flyout"));
		languageChangeLink.click();
		
		WebElement englishRadioBtn = driver.findElement(By.xpath("//input[@value='en_US']/following-sibling::i"));
		WebElement spanishRadioBtn = driver.findElement(By.xpath("//input[@value='es_US']/following-sibling::i"));
		
		Thread.sleep(3000);
		spanishRadioBtn.click();
		
		Thread.sleep(3000);
		englishRadioBtn.click();
	}
	
	void handlingDropDown() throws InterruptedException {
		// Drop down - 1. Static drop down -> Select class | 2. Dynamic drop down -> mouse operation -> Actions class
		
		// Static drop down -> Select class -> 1. index | 2. visible txt | 3. value
		
		WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(searchDropDown);
//		Thread.sleep(3000);
//		select.selectByIndex(10);
//		Thread.sleep(3000);
//		select.selectByValue("search-alias=warehouse-deals");
//		Thread.sleep(3000);
//		select.selectByVisibleText("Baby");
		
		for(int i=1; i<=30; i++) {
			select.selectByIndex(i);
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		HandlingCheckBoxRadioBtnDropDown hcb = new HandlingCheckBoxRadioBtnDropDown();
//		hcb.negativeLoginFunctionalityTest();
//		hcb.handlingRadioBtn();
		hcb.handlingDropDown();
		hcb.closeApp();

	}

}
