package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountRegisterTest {
	
	
	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
//		System.out.println(br.getPageTitle());
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By emailID = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");	
//		By confirmPassword = By.id("input-confirm");
		
//		By loginLink = By.linkText("Login");
//		By header = By.tagName("h2");
		
		//Total Links
		List<WebElement>linksList = driver.findElements(By.tagName("a"));
		System.out.println("total links:" +linksList.size());
		
		for(int i=0;i<linksList.size();i++) {
		String linkVal = linksList.get(i).getAttribute("href");
		System.out.println(linkVal);
		}
		
		//Total text fields
//		List<WebElement>inputList = driver.findElements(By.tagName("input"));
//		System.out.println("total text fields:" +inputList.size());
//		
//		for(WebElement e:inputList) {
//			String placeholderVal = e.getAttribute("placeholder");
//			System.out.println(placeholderVal);
//		}
//		
		
		
		
		
		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.doSendkeys(firstName, "Tom");
//		eleutil.doSendkeys(lastName, "Hardy");
//		eleutil.doSendkeys(emailID, "tomhardy@gmail.com");
//		boolean flag = eleutil.doIsDisplayed(emailID);
//		System.out.println(flag);
//		eleutil.doSendkeys(telephone, "98987867");
//		eleutil.doSendkeys(password, "tomhardy");
//		eleutil.doSendkeys(confirmPassword, "tomhardy");
//		eleutil.doClick(loginLink);
//		String headerText = eleutil.doGetText(header);
//		System.out.println(headerText);
		
		
	}

}
