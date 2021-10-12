package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	
	static WebDriver driver;


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");
		By customers = By.linkText("Customers");
		waitForElementPresenceWithFluentWait(customers,5,2000).click();
		
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//										.withTimeout(Duration.ofSeconds(10))
//											.withMessage("Element is not found..")
//												.pollingEvery(Duration.ofMillis(2000))
//													.ignoring(StaleElementReferenceException.class);
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(customers)).click();
											
		
	}
	
	public static WebElement waitForElementPresenceWithWebDriverWait(By locator, int timeOut, int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.withMessage(Error.TIME_OUT_WEB_ELEMENT)
						.pollingEvery(Duration.ofMillis(pollingTime))
						.ignoring(StaleElementReferenceException.class, NoSuchElementException.class);				
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public static WebElement waitForElementPresenceWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
					.withMessage(Error.TIME_OUT_WEB_ELEMENT)
						.pollingEvery(Duration.ofMillis(pollingTime))
						.ignoring(StaleElementReferenceException.class, NoSuchElementException.class);	
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	public static Alert waitForAlertPresenceWithFluetWait(int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
					.withMessage(Error.TIME_OUT_WEB_ELEMENT)
						.pollingEvery(Duration.ofMillis(pollingTime))
							.ignoring(NoAlertPresentException.class);

		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static WebDriver waitForFramePresenceWithFluetWait(By frameLocator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
					.withMessage(Error.TIME_OUT_WEB_ELEMENT)
						.pollingEvery(Duration.ofMillis(pollingTime))
							.ignoring(NoSuchFrameException.class);

		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

}
