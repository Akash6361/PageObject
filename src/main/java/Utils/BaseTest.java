package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
	
	 protected static WebDriver driver;

	
	public static void initalizeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash Gowda\\Desktop\\CGI-Automation Testing Core training\\SeleniumWorkspace\\src\\main\\resources\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        driver=new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
	}
	

}
