package tests;

import org.testng.annotations.Test;

import base.baseTest;
import pages.LoginPage;

public class LoginTest extends baseTest {
  @Test
	public void loginTest() {
	LoginPage login=new LoginPage(driver);
	login.enterUsername("standard_user");
	login.enterPassword("secret_sauce");
	login.clickLogin();
}
}