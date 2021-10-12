package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
//		driver.findElement(By.xpath("//a[text()='22']"));
		
//		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		System.out.println(actMonthYear);
//		String expMonthYear = "November 2022";
//		while(!actMonthYear.equals(expMonthYear)) {
//			
//			//click on next
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		}
		
//		selectDay("10");
		selectDate("November 2022", "10");
		
	}
	
	public static void selectDate(String expMonthYear, String day) {
		
		if(Integer.parseInt(day)>31) {
			System.out.println("wrong date passed.... please pass correct date");
			return;
		}
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
//		String expMonthYear = "November 2022";
		while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			
			//click on next
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}
		
		selectDay(day);
		
	}
	
	public static void selectDay(String day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}

}
