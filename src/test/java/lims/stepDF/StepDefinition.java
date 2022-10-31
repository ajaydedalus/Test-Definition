package lims.stepDF;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("user is on the lims login page")
	public void user_is_on_the_lims_login_page() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://130.78.62.52:107/#/Login?IPADDRESS=192.168.1.100&MACHINE=DHHCLBX5PFB3");
	}

	@When("user enter valid {string}and{string}")
	public void user_enter_valid_and(String string, String string2) {
		WebElement txtUsername = driver.findElement(By.id("txtUsername"));
		txtUsername.sendKeys("VM");
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
	txtPassword.sendKeys("Pas123");
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		btnLogin.click();
	}
	@When("user click the menu")
	public void user_click_the_menu() throws InterruptedException {
		Thread.sleep(30000);
		String homePage = driver.getCurrentUrl();
		assertTrue("Checking whether user on home page",homePage.contains("Mainpage"));
			
		
		WebElement btnMenu = driver.findElement(By.xpath("//i[text()='menu']"));
		btnMenu.click();
	}

	@When("user click the Test Definition")
	public void user_click_the_Test_Definition() throws InterruptedException {
		Thread.sleep(5000);
		WebElement btnAdmin = driver.findElement(By.xpath("//div[text()=' Admin ']"));
		btnAdmin.click();
		Thread.sleep(5000);
		WebElement btnTests = driver.findElement(By.xpath("//div[text()=' Tests ']"));
		btnTests.click();
		Thread.sleep(5000);
		WebElement btnTestDefinition = driver.findElement(By.xpath("//div[text()=' Test definition ']"));
		btnTestDefinition.click();
	}

	@When("user click the test")
	public void user_click_the_test() throws InterruptedException {
		Thread.sleep(10000);
		WebElement btnCreate = driver.findElement(By.xpath("//span[text()=' CREATE ']"));
		btnCreate.click();
	
	}

	@When("user enter valid deatails")
	public void user_enter_valid_deatails() throws InterruptedException, AWTException {
		Thread.sleep(10000);
		WebElement txtCode = driver.findElement(By.xpath("//input[@id='Tcode']"));
		txtCode.sendKeys("qwert");
		WebElement txtExpansion = driver.findElement(By.xpath("//input[@id='TExp']"));
		txtExpansion.sendKeys("qwertyso");
		Thread.sleep(5000);
		WebElement btnDicipline = driver.findElement(By.xpath("(//span[text()='Discipline'])[1]"));
		btnDicipline.click();
		Thread.sleep(5000);
		WebElement btnBloodScience = driver.findElement(By.xpath("//span[text()=' Blood Sciences']"));
		btnBloodScience.click();
		Thread.sleep(5000);
		WebElement btnSubDicipline = driver.findElement(By.xpath("(//span[text()='Subdiscipline'])[2]"));
		btnSubDicipline.click();
		Thread.sleep(5000);
		WebElement btnBioChemistry = driver.findElement(By.xpath("(//div[text()='Bio-Chemistry'])[3]"));
		btnBioChemistry.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		WebElement btnTest = driver.findElement(By.xpath("//input[@data-placeholder='Tests']"));
		btnTest.click();
		WebElement btnTtype = driver.findElement(By.xpath("//span[text()='T-Type']"));
		btnTtype.click();
	}
	@When("user click the test method")
	public void user_click_the_test_method() throws InterruptedException {
		WebElement btnResultDetail = driver.findElement(By.xpath("//span[text()='  RESULT DETAILS ']"));
		btnResultDetail.click();
		Thread.sleep(6000);
		WebElement btnResultType = driver.findElement(By.xpath("(//span[text()='Result type'])[1]"));
		btnResultType.click();
		WebElement btnQuantitative = driver.findElement(By.xpath("//span[text()='Quantitative']"));
		btnQuantitative.click();
		Thread.sleep(6000);
		WebElement btnTestMethod = driver.findElement(By.xpath("(//span[text()='Test method'])[1]"));
		btnTestMethod.click();
		WebElement btn1edit = driver.findElement(By.xpath("//span[text()=' 1edit ']"));
		btn1edit.click();
		WebElement btnADDUPDATE = driver.findElement(By.xpath("//span[text()=' ADD/UPDATE METHOD ']"));
		btnADDUPDATE.click();
	   
	}
	@When("user enter reference range")
	public void user_enter_reference_range() throws InterruptedException {
		Thread.sleep(6000);
		WebElement txtLow = driver.findElement(By.xpath("//input[@name='txDefaultRefRangeLow']"));
		txtLow.sendKeys("15");
		WebElement txtHigh = driver.findElement(By.xpath("//input[@name='txtDefaultRefRangeHigh']"));
		txtHigh.sendKeys("25");
		WebElement btnAddRows = driver.findElement(By.xpath("(//span[text()='+ Add row(s)'])[3]"));
		btnAddRows.click();
	}

	@When("user enter Delta  check")
	public void user_enter_Delta_check() throws InterruptedException {
		Thread.sleep(6000);
		WebElement txtConcentration = driver.findElement(By.xpath("(//input[@class='mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored ng-star-inserted'])[2]"));
		txtConcentration.sendKeys("180");
		WebElement btnTypeOfChanges = driver.findElement(By.xpath("//div[@id='mat-select-value-43']"));
	    btnTypeOfChanges.click();
	    WebElement btnAbsolute = driver.findElement(By.xpath("//span[text()=' Absolute ']"));
	    btnAbsolute.click();
	    WebElement txtAllowedChanges = driver.findElement(By.xpath("(//input[@class='mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored ng-star-inserted'])[3]"));
	    txtAllowedChanges.sendKeys("3");
	    WebElement btnDeltaCheck = driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c106-313 ng-star-inserted']"));
		btnDeltaCheck.click();
		WebElement btnIncrease = driver.findElement(By.xpath("//span[text()=' Increase']"));
		btnIncrease.click();
	}

	
	

}
