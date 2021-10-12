package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		//headless- browser options
		//Ghostdriver- phantomJS- external library--int
		//HTMLunit browser- ineteacts with HTML page source of application
		
		//testing is happening behind the scene
		//faster then UI mode
		//not recommended for complex application
		//recommended for sanity test
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("---headless");
		co.addArguments("---incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
		

	}

}
