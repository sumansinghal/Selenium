package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	public WebDriver driver;
	/**
	 * This method is used to init driver on the given browser name	 
	 * @param browserName
	 * @return - it return driver
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is :" +browserName);
		if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suman Agarwal\\Driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suman Agarwal\\Driver\\chromedriver.exe");
			driver= new FirefoxDriver();
		}
		
		else if(browserName.equals("safari")) {
			driver= new SafariDriver();
	}
		
		else {
			System.out.println("Please pass right browser..." +browserName);
			
		}
		return driver;
	}
	
	public void launchUrl(String url) {
		if(url == null || url.isEmpty()){
			System.out.println("url is incorrect");
			return;
		}
		driver.get(url);
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
}
