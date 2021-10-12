package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementPresent {
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		List<WebElement> searchList = driver.findElements(search);
//		if(searchList.size()==1) {
//			System.out.println("search list is present");
//		
//		}
//		else {
//			System.out.println("not present");
//		
//	}
//		By search = By.name("search");
		By forgotPWDLink = By.linkText("Forgotten Password");
		System.out.println(checkElementsDeisplayed(forgotPWDLink,2));
		
//		checkElementsDeisplayed(search,1);
	//	System.out.println(checkElementsDeisplayed(search));
		
	}
	
	public static List<WebElement>getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static boolean checkElementsDeisplayed(By locator) {
		if(getElements(locator).size()==1) 
			return true;
			return false;
			
		}
	public static boolean checkElementsDeisplayed(By locator, int eleOccurence) {
		if(getElements(locator).size()==eleOccurence) 
			return true;
			return false;
	}
	}
