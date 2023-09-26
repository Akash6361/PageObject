package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.BaseTest;

public class Logout extends BaseTest {
	
	 public Logout() {
	        PageFactory.initElements(super.driver, this);
	    }
	    @FindBy(xpath="//input[@class='inputtext _55r1 _6luy']")
		WebElement email;
		
		
		@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']")
		WebElement password;
		
		@FindBy(xpath="//button[@name='login']")
		WebElement submit;
	 
	    @FindBy(xpath="//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]")
	    WebElement accbutton;
	    
	    @FindBy(xpath="//span[text()='Log out']")
	     WebElement logout;
	    
	    @FindBy(xpath="//div[@class='__xn']")
	    WebElement gettext;
	    
		public void Entemail(String s) {
			email.sendKeys(s);
			
		}
		public void password(String ss) {
			password.sendKeys(ss);
			
			
		}
		public void login() {
			submit.click();
				
		}
		
		public void acc() {
			WebDriverWait wait = new WebDriverWait(driver, 1000); 
	      accbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]")));
	    
			accbutton.click();
		}
		public void log() {
			WebDriverWait wait = new WebDriverWait(driver, 1000); 
	        logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log out']")));
			logout.click();
		}
		
		public void assertion() {
			WebDriverWait wait = new WebDriverWait(driver, 1000); 
	        logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='__xn']")));
			 String s=gettext.getText();
			 System.out.println(s);
			 Assert.assertEquals(s,"Next time you log in, click your picture. To remove an account from this page, click here.");
			
		}
	 

}
