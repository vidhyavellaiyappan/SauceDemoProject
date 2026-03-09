package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {
WebDriver driver;
public LogOutPage(WebDriver driver) {
	this.driver=driver;
	
}
public String getOrderMessage() {
return	driver.findElement(By.className("complete-header")).getText();
}
public void clickBackHome() {
	driver.findElement(By.id("back-to-products")).click();
}
}
