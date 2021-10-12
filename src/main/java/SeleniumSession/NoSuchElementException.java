package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementException {
		
		static WebDriver driver;
		
		
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			By search = By.name("search11");
			By forgotPWDLink = By.linkText("Forgotten Password");
			//driver.findElement(search).sendKeys("Macbook");//not such element exception
			
			List<WebElement> searchList = driver.findElements(search);
			System.out.println(searchList.size());
			

	}

}
