package io.zahid.selenium.tutorial.site.toolsqa;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage {

	/**
	 * 
	 * https://www.toolsqa.com/automation-practice-form
	 * 
	 */

	WebDriver driver;

	@FindBy(partialLinkText = "Link Test")
	WebElement partialLinkTestLink;

	@FindBy(linkText = "Link Test")
	WebElement linkTestLink;

	@FindBy(name = "firstname")
	WebElement firstNameInput;

	@FindBy(id = "lastname")
	WebElement lastNameInput;

	@FindBy(id = "buttonwithclass")
	WebElement simpleButton;

	@FindBy(id = "sex-0")
	WebElement maleRadioButton;

	@FindBy(id = "sex-1")
	WebElement femaleRadioButton;

	@FindBy(id = "exp-0")
	WebElement exp1RadioButton;

	@FindBy(id = "exp-1")
	WebElement exp2RadioButton;

	@FindBy(id = "exp-2")
	WebElement exp3RadioButton;

	@FindBy(id = "exp-3")
	WebElement exp4RadioButton;

	@FindBy(id = "exp-4")
	WebElement exp5RadioButton;

	@FindBy(id = "exp-5")
	WebElement exp6RadioButton;

	@FindBy(id = "exp-6")
	WebElement exp7RadioButton;

	@FindBy(id = "datepicker")
	WebElement dateInput;

	@FindBy(id = "profession-0")
	WebElement manualTesterCheckbox;

	@FindBy(id = "profession-1")
	WebElement automationTesterCheckbox;

	@FindBy(id = "photo")
	WebElement profilePictureUploadInput;

	@FindBy(linkText = "Selenium Automation Hybrid Framework")
	WebElement seleniumAutomationHybridFrameworkDownloadLink;

	@FindBy(linkText = "Test File to Download")
	WebElement testFileToDownloadDownloadLink;

	@FindBy(id = "tool-0")
	WebElement qtpCheckbox;

	@FindBy(id = "tool-1")
	WebElement seleniumIDECheckbox;

	@FindBy(id = "tool-2")
	WebElement seleniumWebdriverCheckbox;

	@FindBy(id = "continents")
	WebElement continentsSingleSelect;

	@FindBy(id = "continentsmultiple")
	WebElement continentsMultipleSelect;

	@FindBy(id = "selenium_commands")
	WebElement seleniumCommandsMultipleSelect;

	@FindBy(id = "submit")
	WebElement button;

	@FindBy(id = "submit1")
	WebElement button2;

	@FindBy(id = "submit2")
	WebElement button3;

	@FindBy(id = "submit3")
	WebElement button4;

	@FindBy(xpath = "//*[@id=\"NextedText\"]/span")
	WebElement text1;

	@FindBy(xpath = "//*[@id=\"NextedText\"]/text()")
	WebElement text2;

	@FindBy(xpath = "//*[@id=\"beverages\"]/li[1]")
	WebElement coffeeText;

	@FindBy(xpath = "//*[@id=\"beverages\"]/li[2]")
	WebElement teaText;

	@FindBy(xpath = "//*[@id=\"beverages\"]/li[3]")
	WebElement milkText;

	@FindBy(xpath = "//*[@id=\"beverages\"]/li[4]")
	WebElement skimmedMilkText;

	public PracticeFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickPartialLinkTestLink() {
		partialLinkTestLink.click();
	}

	public void clickLinkTestLink() {
		linkTestLink.click();
	}

	public void inputFirstName(String firstName) {
		firstNameInput.sendKeys(firstName);
	}

	public void inputLastName(String lastName) {
		lastNameInput.sendKeys(lastName);
	}

	public void clickSimpleButton() {
		simpleButton.click();
	}

	public void clickMaleRadioButton() {
		maleRadioButton.click();
	}

	public void clickFemaleRadioButton() {
		femaleRadioButton.click();
	}

	public void clickYearsOfExpereince1() {
		exp1RadioButton.click();
	}

	public void clickYearsOfExpereince2() {
		exp2RadioButton.click();
	}

	public void clickYearsOfExpereince3() {
		exp3RadioButton.click();
	}

	public void clickYearsOfExpereince4() {
		exp4RadioButton.click();
	}

	public void clickYearsOfExpereince5() {
		exp5RadioButton.click();
	}

	public void clickYearsOfExpereince6() {
		exp6RadioButton.click();
	}

	public void clickYearsOfExpereince7() {
		exp7RadioButton.click();
	}

	public void inputDate(String date) {
		dateInput.sendKeys(date);
	}

	public void clickManualTesterCheckbox() {
		manualTesterCheckbox.click();
	}

	public void clickAutomationTesterCheckbox() {
		automationTesterCheckbox.click();
	}

}