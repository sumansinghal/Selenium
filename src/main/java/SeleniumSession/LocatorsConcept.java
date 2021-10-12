package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		//create webelement+perform actions(click, sendkeys, get text, isdisplayed
		//by is class 
		//id is static method since we are using class
		
		//1
		//driver.findElement(By.id("input-email")).sendKeys("suman.lr01@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("selenium");
		
		//2.
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		email.sendKeys("suman.lr01@gmail.com");
//		password.sendKeys("selenium");
		//3 by locator:
		
		//By emailID = By.id("input-email");
		//By password = By.id("input-password");
		
		//driver.findElement(emailID).sendKeys("suman.lr01@gmail.com");
		//driver.findElement(password).sendKeys("selenium");
		
		
		//4 
//		By emailID = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement eid = driver.findElement(emailID);
//		WebElement pwd = driver.findElement(password);
//		
//		eid.sendKeys("suman.lr01@gmail.com");
//		eid.sendKeys("selennium");
		
		
		//5.generic functions: get element()
//		By emailID = By.id("input-email");
//		By password = By.id("input-password");
//		getElement(emailID).sendKeys("suman.lr01@gmail.com");
//		getElement(password).sendKeys("selenium");
		
//		By emailID = By.id("input-email");
//		By password = By.id("input-password");
		//doSendkeys(emailID, "suman.lr01@gmail.com");
		//doSendkeys(password,"selenium");
		//7. 
		
		
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailID = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");	
		By confirmPassword = By.id("input-confirm");
		
		ElementUtil eleutil= new ElementUtil(driver);
		eleutil.doSendkeys(firstName, "Tom");
		eleutil.doSendkeys(lastName, "Hardy");
		eleutil.doSendkeys(emailID, "tomhardy@gmail.com");
		eleutil.doSendkeys(telephone, "98987867");
		eleutil.doSendkeys(password, "tomhardy");
		eleutil.doSendkeys(confirmPassword, "tomhardy");
		
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
