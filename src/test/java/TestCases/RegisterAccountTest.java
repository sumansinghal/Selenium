package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterAccountTest extends BaseTest {
	
	
	@Test
	public void registerAccountTest() {
		doRegister("A","B","ss@gmail.com", "1234", "pwd" , "pwd" );
	}
	
	public boolean doRegister(String firstname, String lastname, String email, String tele , String pwd, String confirmpwd ) {
		
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys( tele);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmpwd);
		driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		String error = driver.findElement(By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]")).getText();
		if(error.contains("Password must be between 4 and 20 characters!")) {
			return true;
			
		}
		return false;
	}
	
	
	
	

}
