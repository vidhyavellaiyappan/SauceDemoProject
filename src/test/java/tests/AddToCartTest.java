package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest;
import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest  extends baseTest{
@Test()
	public void AddToCartTest() {
	
		ProductPage product=new ProductPage(driver);
		product.addTocart();
		String cardcount = product.getCardcount();
		System.out.println("Items in cart:"+cardcount);
		Assert.assertEquals(cardcount, "1");
		product.clickCarticon();
	}
	
}
