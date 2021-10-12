package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLang {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		By langLinksXpath = By.xpath("//div[@id='SIvCob']/a");
//		doLinkClick(langLinksXpath, "বাংলা");
//		
		By footer = By.xpath("//footer//a");
		doLinkClick(footer,"Contact Us");
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doLinkClick(By locator, String linkValue) {
		List<WebElement> langList = getElements(locator);
		System.out.println(langList.size());
		for(WebElement e : langList) {
			String text = e.getText();
			System.out.println(text);
			if(text.trim().equals(linkValue)) {
			e.click();
			break;
			}
		}
		
	}

}
