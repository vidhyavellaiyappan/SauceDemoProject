package tests;

import org.testng.annotations.Test;

import base.baseTest;
import pages.CartPage;
import pages.CheckOutInfoPage;
import pages.ProductPage;

public class CheckOutInfoTest extends baseTest{
	@Test 
	public void CheckOutInfoTest() {
		ProductPage product=new ProductPage(driver);
		CartPage cart=new CartPage(driver);
		CheckOutInfoPage check=new CheckOutInfoPage(driver);
		product.addTocart();
		product.clickCarticon();
		cart.checkout();
		check.enterFirstname("Vidhya");
		check.enterLastname("VV");
		check.enterPostalcode("625018");
		check.clickContinue();
		check.clickFinish();
		
	}

}
