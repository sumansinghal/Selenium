package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadersPrint {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		ElementUtil eu= new ElementUtil(driver);
		
		
		//Assignment 1getting header text
//		List<WebElement> headers = driver.findElements(By.xpath("//div[@class='col-sm-10']/h3"));
//		
//		for(WebElement e: headers) {
//			String headervalue = e.getText();
//			System.out.println(headervalue);
//			
//		}
		//Assignment 2.
		By linkVal = By.xpath("//div[@id=\"navbar-collapse\"]//a");
		eu.doLinkClick(linkVal, "Pricing");
		//List<WebElement> linksList = driver.findElements(By.xpath("//li[@class='active']/a"));
		//System.out.println("total links:" +linksListval.size());
		//doLinkClick(links,"Pricing");
		
		
//		for(WebElement e:linksListval) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Pricing")) {
//			e.click();
//			//break;
//		}
		
	}
//		public static List<WebElement> getElements(By locator) {
//			return driver.findElements(locator);
//		}
//		
//		public static void doLinkClick(By locator, String linkValue) {
//			List<WebElement> langList = getElements(locator);
//			System.out.println(langList.size());
//			for(WebElement e : langList) {
//				String text = e.getText();
//				System.out.println(text);
//				if(text.equals(linkValue)) {
//				e.click();
//				//break;
//				}
//			}
		
		
		
		
		
		
	
		
	

}
