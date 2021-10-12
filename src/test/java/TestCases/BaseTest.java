package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	@Parameters({"url", "browser"})
	@BeforeTest
	public void setUp(String url, String browser) {
		
		
		switch(browser) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
//		case"firefox":
//			WebDriverManager.chromedriver().setup();
//			driver = new firefoxDriver();
//			break;
//		case"safari":
//			WebDriverManager.chromedriver().setup();
//			driver = new safariDriver();
//			break;
			default:
			System.out.println("please pass right browser");
			break;
		}
		
		
//		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
