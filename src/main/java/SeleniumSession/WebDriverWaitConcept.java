package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demoauto.xyz/signin");

		driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[@title='Add lead']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
//		WebElement compName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_name")));
		By comp = By.id("company_namea");
		By vatNum = By.id("vat_number");// variable not hitting server
		waitforElementPresent(comp,10, 2000).sendKeys("IBM");
		waitforElementPresent(vatNum, 5).sendKeys("12345");
//		compName.sendKeys("IBM");
	}
	
	public static WebElement waitforElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
		
	}
	
	public static WebElement waitforElementPresent(By locator, int timeOut, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut,intervalTime );
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

}
}
