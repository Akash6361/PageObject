package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.BaseTest;

public class Login extends BaseTest {
	
	public Login() {
		PageFactory.initElements(super.driver, this);
	}
	
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']")
	WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement submit;

	
	@FindBy(xpath="//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x14z4hjw x3x7a5m xngnso2 x1qb5hxa x1xlr1w8 xzsf02u']")
	WebElement welmsg;
	
	public void Entemail(String s) {
		email.sendKeys(s);
		
	}
	public void password(String ss) {
		password.sendKeys(ss);
		
		
	}
	public void login() {
		submit.click();
			
	}
	public void Getmsg() {
		String s =welmsg.getText();
		System.out.println(s);
		Assert.assertEquals(s,"Welcome to Facebook, Akash");
		
	}
	
	
	
	

}
