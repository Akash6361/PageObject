package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.BaseTest;

public class Singup extends BaseTest {

    public Singup() {
        PageFactory.initElements(super.driver, this);
    }

    @FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    private WebElement createNew;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='reg_email__']")
    private WebElement email;
    
    @FindBy(name="reg_email_confirmation__")
    private WebElement reemail;
  

    @FindBy(xpath = "//input[@name='reg_passwd__']")
    private WebElement password;

    @FindBy(xpath = "//select[@title='Day']")
    private WebElement dayDropdown;

    @FindBy(xpath = "//select[@title='Month']")
    private WebElement monthDropdown;

    @FindBy(xpath = "//select[@title='Year']")
    private WebElement yearDropdown;

    @FindBy(xpath = "//input[@value='2']")
    private WebElement radio;

    @FindBy(xpath = "//button[@name='websubmit']")
    private WebElement submitButton;

    public void clickCreateNew() {
        createNew.click();
    }

    public void enterFirstName(String s) {
    	WebDriverWait wait = new WebDriverWait(driver, 100); 
        WebElement firstNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));

        firstName.sendKeys(s);
    }

    public void enterLastName(String ss) {
        lastName.sendKeys(ss);
    }

    public void enterEmail(String sss) {
        email.sendKeys(sss);
    }
    public void reEmail(String sss) {

   
    	reemail.sendKeys(sss);
    }

    public void enterPassword(String ssss) {
        password.sendKeys(ssss);
    }

    public void selectDay(String day1) {
        Select select = new Select(dayDropdown);
        select.selectByVisibleText(day1);
    }

    public void selectMonth(String mon) {
        Select select = new Select(monthDropdown);
        select.selectByVisibleText(mon);
    }

    public void selectYear(String year1) {
        Select select = new Select(yearDropdown);
        select.selectByVisibleText(year1);
    }

    public void clickRadio() {
        radio.click();
    }

    public void clickSubmit() {
        submitButton.click();
    }
}
