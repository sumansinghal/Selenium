package testngpackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartDemo {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}
	
	@Test
	public void inputEmailTest() {
		driver.findElement(By.id("input-email")).sendKeys("suman.lr01@gmail.comm");
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed());
	}
	@Test
	public void validateEmailTest() {
		driver.findElement(By.id("input-password")).sendKeys("selenium");
	}
	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	


}
