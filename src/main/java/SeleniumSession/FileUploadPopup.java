package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type="file" -- is mandatory
		
		driver.findElement(By.name("upfile")).sendKeys("C:/Users/Suman Agarwal/Downloads/Foodbill.pdf");
				//autoit - windows -- wont work on linux/docker
				//sikuli -- image resolution - wont work on headless
				//robot -- windows -- wont work on linux/docker/headless
				
				
				//frames -- switchTo
				//window based/browser based pop ups -- multiple window handling -- windows handler API
				
				//JS pop
				//auth pop
				//file upload
				//frame webelement
				//browser based pop ups 
				//advertisement pop ups

		
	}

}
