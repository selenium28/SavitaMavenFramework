package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utility.UtilityFile;

public class LoginPage extends BaseClass{
	
	UtilityFile objUtilityFile;
	
	@FindBy(xpath = "//*[@name='username']")
	WebElement username_TextBox;
	
	@FindBy(xpath = "//*[@type='password']")
	WebElement password_TextBox;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement login_Button;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void userName(String user) {
		objUtilityFile = new UtilityFile();
		objUtilityFile.sendKeysWebElement(username_TextBox, user);
//		username_TextBox.sendKeys(user);
		System.out.println("Username text Entered");
	}
	
	public void password(String pass) {
		password_TextBox.sendKeys(pass);
		System.out.println("password text Entered");
	}
	
	public void loginButton() {
		objUtilityFile = new UtilityFile();
		objUtilityFile.ClickOnWebElement(login_Button, 10);
		System.out.println("loginButton Button clicked");
	}
	
//	public void loginFunction(String user, String pass) {
//		objUtilityFile = new UtilityFile();
//		username_TextBox.sendKeys(user);
//		System.out.println("Username text Entered");
//	}
	

}
