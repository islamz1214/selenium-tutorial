package io.zahid.selenium.tutorial.site.toolsqa.tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import io.zahid.selenium.tutorial.site.toolsqa.PracticeFormPage;

public class PracticeFormTest {

	WebDriver driver;
	PracticeFormPage page;

	@BeforeTest
	public void beforeTest() {

		// Chromedriver path
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

		// Create ChromeDriver object
		driver = new ChromeDriver();

		// Open practice form site
		driver.get("https://www.toolsqa.com/automation-practice-form");

		// Create PracticeFormPage object
		page = new PracticeFormPage(driver);

		// Set window to full screen
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void testPartialLinkTestLink() {
		page.clickPartialLinkTestLink();
	}

	@Test(priority = 1)
	public void testLinkTestLink() {
		page.clickLinkTestLink();
		driver.navigate().back();
	}

	@Test(priority = 2)
	public void testFirstNameInput() {
		page.inputFirstName("John");
		page.inputLastName("Doe");
	}

	@Test(priority = 3)
	public void testSexRadioButtons() {

		// Scroll down 500 pixels to allow element in viewport
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500);");

		page.clickMaleRadioButton();
		page.clickFemaleRadioButton();

	}

	@Test(priority = 4)
	public void testYearsOfExperienceRadioButtons() {
		page.clickYearsOfExpereince1();
		page.clickYearsOfExpereince2();
		page.clickYearsOfExpereince3();
		page.clickYearsOfExpereince4();
		page.clickYearsOfExpereince5();
		page.clickYearsOfExpereince6();
		page.clickYearsOfExpereince7();
	}

	@Test(priority = 5)
	public void testDateInputs() {
		page.inputDate("10/16/2019");
	}

	@Test(priority = 6)
	public void testProfessionCheckbox() {
		page.clickManualTesterCheckbox();
		page.clickAutomationTesterCheckbox();
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
