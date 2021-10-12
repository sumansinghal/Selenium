package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfoTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/new-zealand-in-bangladesh-2021-1272089/bangladesh-vs-new-zealand-4th-t20i-1272096/full-scorecard");
		

		System.out.println(getWicketTakerName("Finn Allen"));
		
		System.out.println(getBatsmanScoreList("Finn Allen"));
		

	}
	
	public static String getWicketTakerName(String batsmanName) {
		
		String wicketTakerXpath = "//a[text()='"+batsmanName+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(wicketTakerXpath)).getText();
		
	}
	
	public static List<String>  getBatsmanScoreList(String batsmanName) {
		
		String scoreXpath = "//a[text()='"+batsmanName+"']/parent::td/following-sibling::td";
		List<WebElement> scoreList = driver.findElements(By.xpath(scoreXpath));
		List<String> scoreValueList= new ArrayList<String>();
		
		for(int i=1;i<scoreList.size();i++) {
			String text = scoreList.get(i).getText();
			scoreValueList.add(text);
			
		}
		return scoreValueList;  //return list of string
		
	}

}
