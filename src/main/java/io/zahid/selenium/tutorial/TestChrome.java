package io.zahid.selenium.tutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestChrome {
 
	public static void main(String[] args) throws InterruptedException {
	 
		// Chromedriver path	
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		
		// Open Google
		driver.get("http://www.google.com");
		 
		// Maximize browser
		driver.manage().window().maximize();
		
		// Wait 5 seconds
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		
		// Close the browser
		driver.close();
	
	}
 
}
