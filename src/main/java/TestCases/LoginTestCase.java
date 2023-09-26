package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Login;
import Utils.BaseTest;

public class LoginTestCase {
	@BeforeMethod
	public void initalize() {
		BaseTest.initalizeBrowser();
		
	}
	
	@Test
	public void Login() {
		Login up = new Login();
		
		up.Entemail("yopoj23998@alvisani.com");
		up.password("Akash@55555");
		up.login();
		up.Getmsg();
		
		
	}

}
