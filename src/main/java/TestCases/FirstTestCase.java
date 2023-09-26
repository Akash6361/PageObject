package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Singup;
import Utils.BaseTest;

public class FirstTestCase {
	
	@BeforeMethod
	public void initalize() {
		BaseTest.initalizeBrowser();
		
	}
	
	@Test
	public void enterDetails() {
		
		
		Singup signupPage = new Singup();
		signupPage.clickCreateNew();
		signupPage.enterFirstName("Lizzy");
		signupPage.enterLastName("Gowda");
		signupPage.enterEmail("akash.br.1223@gmail.com");
		signupPage.reEmail("akash.br.1223@gmail.com");
		signupPage.enterPassword("Akash@55555");
		signupPage.selectDay("26");
		signupPage.selectMonth("Jan");
		signupPage.selectYear("1990");
		signupPage.clickRadio();
		signupPage.clickSubmit();
		
	}

}
