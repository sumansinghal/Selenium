package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(5000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();

//		driver.findElement(By.xpath("//a[text()='Indra Nanj']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

//		selectContact("Indra Nanj");
//		System.out.println(getCompName("Indra Nanj"));
//		selectContactDetails("Name");
		
		System.out.println(getContactDetails("Harshitha Deepak"));
		
		//if there are duplicate namesbelow xpath
//		// (//a[text()='Jack Wilson'])[2]/parent::td/following-sibling::td/a[@context='company']		
	}

//	public static void selectContact(String contactName) {
//		String checkboxXpath= "//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
//		driver.findElement(By.xpath(checkboxXpath)).click();
//	}
//	
	public static String getCompName(String contactName) {
		String compNameXpath = "//a[text()='"+contactName+"']/parent::td/following-sibling::td/a[@context='company']";
		return driver.findElement(By.xpath(compNameXpath)).getText();
	}
	// selecting all checkboxes in webtable
	
//	public static void selectContactDetails(String contactName) {
//		String allcheckXpath = "//input[@name='contact_id']";
//
//		List<WebElement> allcheckbox = driver.findElements(By.xpath(allcheckXpath));
//
//		for (WebElement e : allcheckbox) {
//			e.click();
//			break;
//		}
//
//	}
//	
	
	public static List<String> getContactDetails(String contactName) {
		String contactDetailsXpath="//a[text()='"+contactName+"']/parent::td/following-sibling::td";
		List<WebElement> contactDetails = driver.findElements(By.xpath(contactDetailsXpath));
		List<String> contactDetailsList = new ArrayList<String>();
		for(int i=1;i<contactDetails.size();i++) {
			String text = contactDetails.get(i).getText();
			contactDetailsList.add(text);
		}
		return contactDetailsList;
		
	}

}
