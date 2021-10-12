package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	//design
	//Global preconditions---@ Before
	//preconditions@Before
	//test steps--- @test
	//expected and actual result---Assertions
	//post steps---@After
	
	//status---PASS/FAIL----execution
	

	/**
	 *  BS - connectwithDB
		BT - createuser
		BC - launchBrowser/url

				BM - logintoApp
				SearchTest - T1
				AM -- logout
				
				BM - logintoApp
				homePageHeaderTest - T2
				AM -- logout
				
				BM - logintoApp
				homePageTitleTest - T3
				AM -- logout

		AC -- closeBrowser
		AT -- deleteUser
		AS -- disconnectWithDB
	 */
	
	@BeforeSuite
	public void connectwithDB() {
		System.out.println("BS---connect with DB");
		
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT----createuser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC - launchBrowser");
	}

	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM - logintoApp");
	}
	
	@Test
	public void homePageHeaderTest() {
		System.out.println("homePageHeaderTest");
	}
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("SearchTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}

	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnectWithDB");
	}
	

}
