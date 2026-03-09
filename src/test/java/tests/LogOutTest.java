package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest;
import pages.CartPage;
import pages.CheckOutInfoPage;
import pages.LogOutPage;
import pages.ProductPage;

public class LogOutTest extends baseTest{
	
	@Test()
	public void LogOutTest() {
		
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

		LogOutPage logout=new LogOutPage(driver);
		String message = logout.getOrderMessage();
		System.out.println("message:" +message);
		Assert.assertEquals(message, "Thank you for your order!");
		logout.clickBackHome();
	}

}
