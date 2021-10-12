package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAttribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		String attrVal = driver.findElement(By.name("first_name")).getAttribute("type");
		System.out.println(attrVal);
		
		String disablVal = driver.findElement(By.name("submitButton")).getAttribute("disabled");
		System.out.println(disablVal);
		if (disablVal.equals(disablVal)) {
			System.out.println("element is disabled");
		}
		

	}

}
