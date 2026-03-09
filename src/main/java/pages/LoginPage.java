package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseTest;

public class LoginPage {
WebDriver driver;
public  LoginPage(WebDriver driver) {
	
	this.driver=driver;
}

public void enterUsername(String user) {
driver.findElement(By.id("user-name")).sendKeys(user);
}
public void enterPassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
}
public void clickLogin() {
	driver.findElement(By.cssSelector("#login-button")).click();
}
}