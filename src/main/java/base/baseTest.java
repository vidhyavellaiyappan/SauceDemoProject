package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;

public class baseTest {
protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
		options.addArguments("--incognito");

		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-password-manager-reauthentication");

		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	//Login steps:
	    LoginPage login = new LoginPage(driver);
	    login.enterUsername("standard_user");
	    login.enterPassword("secret_sauce");
	    login.clickLogin();
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
