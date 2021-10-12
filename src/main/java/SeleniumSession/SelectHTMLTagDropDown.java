package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectHTMLTagDropDown {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		
		Select select = new Select(country);//select class no default webelement
//		select.selectByIndex(5);// this is used for static dropdown
//		select.selectByVisibleText("India");
		select.selectByValue("India");
		
		By country = By.id("Form_submitForm_Country");
		doSelectByVisibleText(country,"India");
		
		
		

	}
	public  static WebElement getElement(By locator) {// return webelement
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
			
	}
	
	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
			
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
			
	}

}
