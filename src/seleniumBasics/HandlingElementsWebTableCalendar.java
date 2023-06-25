package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementsWebTableCalendar {
	
	WebDriver driver;
	
	HandlingElementsWebTableCalendar() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void tearDown() {
		driver.quit();
	}
	
	void handlingGroupOfElements() { // findElements() -> list of webElements
		driver.get("https://www.amazon.com");
//		List<WebElement> linksInHomePage = driver.findElements(By.tagName("a"));
//		System.out.println("Number of links in homepage: "+linksInHomePage.size());
//		
//		for(WebElement link: linksInHomePage) {
//			System.out.println(link.getText()+" : "+link.getAttribute("href"));
//		}
//		
//		List<WebElement> imagesInHomePage = driver.findElements(By.tagName("img"));
//		System.out.println("Number of images in homepage: "+imagesInHomePage.size());
//		
//		for(WebElement image: imagesInHomePage) {
//			System.out.println(image.getAttribute("alt")+" : "+image.getAttribute("src"));
//		}
		
		List<WebElement> headerMenuLink = driver.findElements(By.cssSelector("#nav-xshop>a"));
		for(WebElement link: headerMenuLink) {
			System.out.println(link.getText()+" : "+link.getAttribute("href"));
		}
	}
	
	void handlingWebTable() {
		driver.get("https://www.amazon.com");
		
		//table[@class='navFooterMoreOnAmazon']/tbody/tr[1]/td[1]/a
		
		WebElement footLinkTable = driver.findElement(By
				.xpath("//table[@class='navFooterMoreOnAmazon']/tbody"));
		System.out.println("Footer links: ");
		System.out.println("---------------------");
		for(int i=1; i<=11; i=i+2) {
			WebElement eachRowElement = footLinkTable.findElement(By.xpath("tr["+String.valueOf(i)+"]"));
			for(int j=1; j<=11; j=j+2) {
				WebElement eachCellElement = eachRowElement.findElement(By
						.xpath("td["+String.valueOf(j)+"]/a"));
				System.out.println(eachCellElement.getText()+" : "+eachCellElement.getAttribute("href"));
			}
		}
		
		WebElement footerListLink = driver.findElement(By.xpath
				("//div[@role='presentation'][@class='navFooterVerticalColumn navAccessibility']/div"));
		System.out.println("Footer lists: ");
		System.out.println("---------------------");
		for(int i=1; i<=7; i=i+2) {
			WebElement eachListElement = footerListLink.findElement(By
					.xpath("div["+String.valueOf(i)+"]"));
			List<WebElement> listElements = eachListElement.findElements(By.xpath("ul/li/a"));
			for(WebElement listElement: listElements) {
				System.out.println(listElement.getText()+" : "+listElement.getAttribute("href"));
			}
		}
	}
	
	void handlingCalendar() {
		driver.get("https://www.timeanddate.com/calendar/");
		String selectedMonth = "April";
		String selectedDay = "10";
		WebElement calendar = driver.findElement(By.xpath("//table[@id='mct1']/tbody"));
		WebElement secondQuater = calendar.findElement(By.xpath("tr[6]"));
		switch(selectedMonth) {
		case "April":
			WebElement AprilMonth = secondQuater.findElement(By.xpath("td[5]/table/tbody"));
			for(int i=1; i<=7; i++) {
				WebElement row = AprilMonth.findElement(By.xpath("tr["+String.valueOf(i)+"]"));
				for(int j=1; j<=7; j++) {
					WebElement cell = row.findElement(By.xpath("td["+String.valueOf(j)+"]"));
					if(selectedDay.equals(cell.getText())) {
						System.out.println(selectedMonth+" "+selectedDay+" : "
					+cell.getAttribute("title"));
						break;
					}
				}
			}
			break;
		case "May":
			WebElement MayMonth = secondQuater.findElement(By.xpath("td[5]/table/tbody"));
			for(int i=1; i<=7; i++) {
				WebElement row = MayMonth.findElement(By.xpath("tr["+String.valueOf(i)+"]"));
				for(int j=1; j<=7; j++) {
					WebElement cell = row.findElement(By.xpath("td["+String.valueOf(j)+"]"));
					if(selectedDay.equals(cell.getText())) {
						System.out.println(selectedMonth+" "+selectedDay+" : "
					+cell.getAttribute("title"));
						break;
					}
				}
			}
			break;
		case "June":
			WebElement JuneMonth = secondQuater.findElement(By.xpath("td[5]/table/tbody"));
			for(int i=1; i<=7; i++) {
				WebElement row = JuneMonth.findElement(By.xpath("tr["+String.valueOf(i)+"]"));
				for(int j=1; j<=7; j++) {
					WebElement cell = row.findElement(By.xpath("td["+String.valueOf(j)+"]"));
					if(selectedDay.equals(cell.getText())) {
						System.out.println(selectedMonth+" "+selectedDay+" : "
					+cell.getAttribute("title"));
						break;
					}
				}
			}
			break;
		}
	}

	public static void main(String[] args) {
		HandlingElementsWebTableCalendar hew = new HandlingElementsWebTableCalendar();
//		hew.handlingGroupOfElements();
//		hew.handlingWebTable();
		hew.handlingCalendar();
		hew.tearDown();

	}

}
