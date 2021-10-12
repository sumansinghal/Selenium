package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrlAndTitle {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		driver.findElement(By.linkText("Register")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.urlContains("route=account/register"));
		if(wait.until(ExpectedConditions.urlContains("route=account/register"))) {
			System.out.println(driver.getCurrentUrl());
	}
		
		if(wait.until(ExpectedConditions.urlToBe("https://demo.opencart.com/index.php?route=account/register"))) {
		System.out.println(driver.getCurrentUrl());
		}	
	}
	
	public static Boolean waitForTitleContains(String urlFraction, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		
		return wait.until(ExpectedConditions.urlContains(urlFraction));
			
	}
	
	public static boolean waitForUrlToBe(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlToBe(urlValue));
	}
	
		
	}


	
