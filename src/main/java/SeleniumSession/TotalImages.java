package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//total images
		//for each print src and alt value
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
//		List<WebElement> imageList = driver.findElements(By.tagName("img"));
//		System.out.println("total images:" +imageList.size());
//		
//		for(int i=0; i<imageList.size();i++) {
//			
//			String altValue = imageList.get(i).getAttribute("alt");
//			String srcValue = imageList.get(i).getAttribute("src");
//			System.out.println(altValue+ " : " + srcValue);
//		}
		
		//total links on page, print text and href value
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("total links:" +linksList.size());
		
		for(WebElement e:linksList) {
			
			String hrefValue = e.getAttribute("href");
			String textValue = e.getText();
			System.out.println(hrefValue + " : " + textValue);
		}
		

	}

}
