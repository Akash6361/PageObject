package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Login;
import PageObject.Logout;
import Utils.BaseTest;

public class LogoutTestCase {
	
	@BeforeMethod
	public void initalize() {
		BaseTest.initalizeBrowser();
		
	}
	
	@Test
	public void Login() {
		Logout up = new Logout();
		
		up.Entemail("akash.br.1223@gmail.com");
		up.password("Akash@55555");
	    up.login();
	    up.acc();
	    up.log();
	    up.assertion();
		
		
	}

}
