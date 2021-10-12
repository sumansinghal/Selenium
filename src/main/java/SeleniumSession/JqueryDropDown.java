package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
//		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		//TC01: single selection
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
//		SelectChoice(choices,"choice 1");
		
		//TC02: multi selection
//		SelectChoice(choices,"choice 1","choice 6 2",  "choice 6 2 1");
		
		//select All
//		SelectChoice(choices, "All");
		sel
	}
	
	
	/**
	 * This method is used to select choices from drop down and handling all three use cases
	 * single
	 * multiple
	 * all(please pass the value as all/All/All
	 * @param locator
	 * @param value
	 */
	public static void SelectChoice(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
		if(!value[0].equalsIgnoreCase("All")) {
		
		for(int i=0;i<choiceList.size();i++) {
			
			String text = choiceList.get(i).getText();
			System.out.println(text);
			
			for(int j=0; j<value.length;j++) {
				
				if(text.equals(value[j])){
					choiceList.get(i).click();
					break;
					
					
					
				}
			}
			
			
		}
		}
		else {
			//select All choices
			try {
			for(WebElement e: choiceList) {
				e.click();
			}
			}catch(Exception e){
				System.out.println("allchoices are selected");
			}
			
		}

	}

}
