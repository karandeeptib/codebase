package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	

	//Pre requisite annotation starting with @Before
	
	@BeforeSuite  //seq1
	public void setup() {
		System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest  //seq2
	public void launchBrowser() {
		System.out.println("Launching chrome browser");
	}
	
	
	@BeforeClass //seq3
	public void login() {
		System.out.println("Login to app");
	}
	
	@BeforeMethod // seq 4
	public void enterURL() {
		System.out.println("Enter the URL");
		}


	// Test case starting with @Test
	@Test // seq 5
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Enter the search test");
	}
	
	@AfterMethod // seq 6
	public void logOut() {
		System.out.println("log out from App");
	}
	
	//post conditions starting with @After Annotations
	
	@AfterClass // seq 7 
	public void closeBrowser() {
		System.out.println("Close browser");
	}
		
	@AfterTest // seq 8
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	

	@AfterSuite
	public void generateTestReport() {
		System.out.println("Generete Test report");
	}
	
}
