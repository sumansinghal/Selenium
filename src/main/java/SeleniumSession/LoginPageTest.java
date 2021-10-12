package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(br.getPageTitle());
		
		By emailID = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendkeys(emailID, "suman.lr01@gmail.com");
		eleutil.doSendkeys(password, "selenium");
		//br.closeBrowser();
		

	}

}
