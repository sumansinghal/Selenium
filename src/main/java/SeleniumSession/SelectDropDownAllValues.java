package SeleniumSession;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllValues {

		static WebDriver driver;
		
		public static void main(String[] args) {
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//			WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
			By country = By.id("Form_submitForm_Country");
			doSelectDropDown(country,"India");
			
//			Select select = new Select(country);
		List<WebElement> optionsList = select.getOptions(); 
//			System.out.println("total options:" + optionsList.size());
//			
////			for(int i = 0; i<optionsList.size();i++) {
////				String text = optionsList.get(i).getText();
////				System.out.println(text);
////				
////			}
//			//without using select class
//			for(WebElement e: optionsList) {
//				String text = e.getText();
//				System.out.println(text);
//				if(text.equals("Albania")) {
//					e.click();
//					break;
//				}
//			}
			
			
	}
		//this is having performance issue
		public  static WebElement getElement(By locator) {// return webelement
			return driver.findElement(locator);
		}

		public static void doSelectDropDown(By locator, String value) {
			Select select = new Select(getElement(locator));
			List<WebElement> optionsList = select.getOptions();
			System.out.println("total options:" + optionsList.size());
			
			//without using select class
			for(WebElement e: optionsList) {
				String text = e.getText();
				System.out.println(text);
				if(text.equals(value)) {
					e.click();
					break;
				}
			}
			
		}
}
