package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class CartPage {
	WebDriver driver;

	public  CartPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void removeCart() {
		
		driver.findElement(By.cssSelector(".btn.btn_secondary.btn_small.cart_button")).click();
	}
	public boolean isCartBadgeDisplayed() {

	    return driver.findElements(By.className("shopping_cart_badge")).size()>0;

	}
	public void checkout() {
		driver.findElement(By.id("checkout")).click();	}
	}

