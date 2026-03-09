package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutInfoPage {
WebDriver driver;
 
public CheckOutInfoPage(WebDriver driver) {
	
	this.driver=driver;
}
public void enterFirstname(String fname) {
	
	driver.findElement(By.id("first-name")).sendKeys(fname);
}
public void enterLastname(String lname) {
	
	driver.findElement(By.id("last-name")).sendKeys(lname);
}
public void enterPostalcode(String post) {
	
	driver.findElement(By.id("postal-code")).sendKeys(post);
}
public void clickContinue() {
	driver.findElement(By.id("continue")).click();
}
public void clickFinish() {
	driver.findElement(By.id("finish")).click();
}

}
