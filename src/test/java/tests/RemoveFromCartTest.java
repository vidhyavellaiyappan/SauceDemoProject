

	package tests;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import base.baseTest;
	import pages.CartPage;
	import pages.ProductPage;

	public class RemoveFromCartTest extends baseTest {

	@Test
	public void removeCartTest(){

	ProductPage product = new ProductPage(driver);
	CartPage cart = new CartPage(driver);

	product.addTocart();
	product.clickCarticon();

	cart.removeCart();

	boolean badge = cart.isCartBadgeDisplayed();
	System.out.println("Cart badge present: " + badge);

	Assert.assertFalse(badge);

	}

	}

