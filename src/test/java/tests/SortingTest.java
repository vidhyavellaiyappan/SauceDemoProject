package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseTest;
import pages.ProductPage;

public class SortingTest extends baseTest {
	@Test
	public void sortingLowToHighTest() {

	ProductPage product = new ProductPage(driver);

	product.sortLowtoHigh();

	String firstPrice = driver.findElement(By.className("inventory_item_price")).getText();

	System.out.println(firstPrice);

	}
}
