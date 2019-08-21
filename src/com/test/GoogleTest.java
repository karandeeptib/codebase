package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
/** 	@BeforeMethod
 
	public void setUp() {
		//define system proporties
		System.setProperty("webdriver.chrome.driver", "D:/Selenium files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		}
		*/
	
	@Test
	@Parameters({"browser","url","searchtext"})
	public void googleSearch(String browser, String url, String searchtext){
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/Selenium files/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);			
		}
		
		//entering the data in search bar and clicking search button
		
		driver.findElement(By.name("q")).sendKeys(searchtext);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();
		
		
	}
	
	/*
	 * @Test(priority=1,groups = "HomePage") 
	 * public void googleTitleTest() { 
	 * String Title=driver.getTitle(); 
	 * System.out.println(Title); 
	 * }
	 * 
	 * @Test(priority=2,groups="Logo") 
	 * public void googleLogoTest() { 
	 * Boolean isLogoDisplayed=driver.findElement(By.xpath("//*[@id=\'hplogo\']")).isDisplayed();
	 * System.out.println("Google Logo is dislayed: "+isLogoDisplayed); 
	 * }
	 * 
	 * @Test(priority=3,groups="HomePage") 
	 * public void isMailLinkPresent() { 
	 * boolean isMailLinkPresent=driver.findElement(By.linkText("Gmail")).isDisplayed();
	 * System.out.println("Gmail link is present on the google page : "+isMailLinkPresent);
	 * }
	 */
	
	/**
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	*/
}
