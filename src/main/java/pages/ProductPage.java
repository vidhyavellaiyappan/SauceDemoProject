package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	WebDriver driver;

	public  ProductPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void addTocart() {
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}
	public String getCardcount() {
		return driver.findElement(By.cssSelector(".shopping_cart_link")).getText();
	}
	public void clickCarticon() {
		driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
	}
	public void sortLowtoHigh(){

		Select sort = new Select(driver.findElement(By.className("product_sort_container")));
		sort.selectByVisibleText("Price (low to high)");

		}
	}

