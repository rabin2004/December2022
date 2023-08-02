package testNGbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UnderstandingAnnotationsDataDriven {
	WebDriver driver;
	String product1 = "apple";
	String invalidProduct1 = "*^(*^*(^*@^*@(*89898342230957329523890";
	
	// Data driven testing -> @DataProvider - data providing method | dataProviderClass & dataProvider keyword
			// 1. Data providing method in the same class: -> using dataProvider keyword only
			// 2. Data providing method in different class of same package: both dataProviderClass & dataProvider keyword
			// 3. Data providing method in different package: both dataProviderClass & dataProvider keyword
	
	@DataProvider
	public String[] positiveSearchData() {
		String[] data = {"apple","samsung","pixel"};
		return data;
	}
	
	@Test(enabled=false) // enabled=false -> gets ignored
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
	
	@Test (dataProvider="positiveSearchData")
  	public void positiveSearchFunctionalityDataDrivenTest(String product) {
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		Actions action = new Actions(driver);
		action.moveToElement(searchTxtBox).build().perform();
		action.click().build().perform();
		action.sendKeys(product).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

		String actualSearchResultPageTitle = driver.getTitle();
		String expectedSearchResultPageTitle = "Amazon.com : "+product;
		
		Assert.assertEquals(actualSearchResultPageTitle, expectedSearchResultPageTitle);
	}
	
	@Test(enabled=false)
  	public void negativeSearchFunctionalityTest() {
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		Actions action = new Actions(driver);
		action.moveToElement(searchTxtBox).build().perform();
		action.click().build().perform();
		action.sendKeys(invalidProduct1).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

		WebElement noResultErrorMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
		Assert.assertTrue(noResultErrorMsg.isDisplayed());
	}
	
	@Test (dataProviderClass=SearchFunctionalityData.class, dataProvider="negativeSearchData")
  	public void negativeSearchFunctionalityDataDrivenTest(String invalidProduct) {
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		Actions action = new Actions(driver);
		action.moveToElement(searchTxtBox).build().perform();
		action.click().build().perform();
		action.sendKeys(invalidProduct).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

		WebElement noResultErrorMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
		Assert.assertTrue(noResultErrorMsg.isDisplayed());
	}
	
	@Test (dataProviderClass=seleniumBasics.SearchFunctionalityData.class, 
			dataProvider="negativeSearchData")
  	public void negativeSearchFunctionalityDataDrivenTestFromDifferntPkg(String invalidProduct) {
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		Actions action = new Actions(driver);
		action.moveToElement(searchTxtBox).build().perform();
		action.click().build().perform();
		action.sendKeys(invalidProduct).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

		WebElement noResultErrorMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
		Assert.assertTrue(noResultErrorMsg.isDisplayed());
	}
  
  @BeforeClass
  public void initialization() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.amazon.com");
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
  }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }
  
  @AfterMethod
  public void backToHomePage() {
	  WebElement amazonIcon = driver.findElement(By.id("nav-logo-sprites"));
	  amazonIcon.click();
  }

}
