package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suman Agarwal\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch browser
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);//session ID remains same
		//if(title.equals("Google")) {
		//	System.out.println("Correct title");
		//}
		//else {
		//	System.out.println("incorrect title");
		//}
		
		System.out.println(driver.getCurrentUrl());
		//driver.quit();//session ID is null
		driver.close();// session ID is same error- invalid session id
		//Quit : NoSuchSessionException: session ID is null. using webdriver after calling quit
		//close: NoSuchSessionException: invalid session ID
		
		driver= new ChromeDriver(); 
		title = driver.getTitle(); //with quit method//get title// session ID is null- org.openqa.selenium.NoSuchSessionException
		System.out.println(title);

	}

}
