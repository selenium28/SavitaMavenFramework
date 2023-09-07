package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath = "//*[@name='username']")
	WebElement username_TextBox;
	
	@FindBy(xpath = "//*[@type='password']")
	WebElement password_TextBox;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement login_Button;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void userName() {
		username_TextBox.sendKeys("Admin");
	}
	
	public void password() {
		password_TextBox.sendKeys("admin123");
	}
	
	public void loginButton() {
		login_Button.click();
	}
	

}
