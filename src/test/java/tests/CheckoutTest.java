package tests;

import org.testng.annotations.Test;

import base.baseTest;
import pages.CartPage;
import pages.ProductPage;

public class CheckoutTest extends baseTest{
	@Test
	public void CheckoutTest() {
	ProductPage product = new ProductPage(driver);
	CartPage cart = new CartPage(driver);
product.addTocart();
product.clickCarticon();
cart.checkout();
	}

}
