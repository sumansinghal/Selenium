package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	
	static WebDriver driver;// need not create object unnecessary

	public static void main(String[] args) {
		
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suman Agarwal\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suman Agarwal\\Driver\\chromedriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browser.equals("safari")) {// set property is not req for safari
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suman Agarwal\\Driver\\chromedriver.exe");
			driver= new SafariDriver();
	}
		
		else {
			System.out.println("Please pass right browser..." +browser);
			
		}
		driver.get("https://www.goodle.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
