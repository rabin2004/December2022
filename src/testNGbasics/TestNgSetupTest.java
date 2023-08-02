package testNGbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNgSetupTest {
	WebDriver driver;
	String invalidEmailAddress = "test@gmail.com";
	String invalidPassword = "test123";
	String product1 = "apple";
	
  @Test // -> method under it is a Test method
	public void negativeLoginFunctionalityTest() {
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		accountList.click();

		WebElement signInpageHeader = driver
				.findElement(By.cssSelector("div[class='a-box-inner a-padding-extra-large']"
						+ ">.a-spacing-small"));

		Assert.assertTrue(signInpageHeader.isDisplayed());
		
		WebElement emailAddressTxtBox = driver.findElement(By.name("email"));
		emailAddressTxtBox.sendKeys(invalidEmailAddress);
		WebElement continueBtn = driver.findElement(By.className("a-button-input"));
		continueBtn.click();
		WebElement emailAddressHeaderWebElement = driver
				.findElement(By.xpath("//*[text()='" + invalidEmailAddress + "']"));
		String emailAddresssHeaderTxt = emailAddressHeaderWebElement.getText();

		Assert.assertEquals(emailAddresssHeaderTxt, invalidEmailAddress);
		
		WebElement passwordTxtBox = driver.findElement(By.name("password"));
		passwordTxtBox.sendKeys(invalidPassword);

		WebElement signInBtn = driver.findElement(By.id("signInSubmit"));
		signInBtn.click();
		WebElement loginErrorMsg = driver.findElement(By.id("auth-warning-message-box"));
		
		Assert.assertTrue(loginErrorMsg.isDisplayed());
	}
  
  @Test
  	public void positiveSearchFunctionalityTest() {
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		Actions action = new Actions(driver);
		action.moveToElement(searchTxtBox).build().perform();
		action.click().build().perform();
		action.sendKeys(product1).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

		String actualSearchResultPageTitle = driver.getTitle();
		String expectedSearchResultPageTitle = "Amazon.com : "+product1;
		
		Assert.assertEquals(actualSearchResultPageTitle, expectedSearchResultPageTitle);
	}
  
  @BeforeMethod
  public void initialization() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.amazon.com");
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}
