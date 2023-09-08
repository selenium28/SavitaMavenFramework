package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class AdminPage extends BaseClass{
	
	@FindBy(xpath = "//*[text()='User Management']")
	WebElement adminUserManagement_Title;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement userName_TextBox;
	
	public AdminPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void adminUserManagementTitle() {
		adminUserManagement_Title.isDisplayed();
		System.out.println("adminUserManagementTitle displayed");
	}
	
	public void adminUsername(String name) {
		userName_TextBox.sendKeys(name);
		System.out.println("adminUsername text entered");
	}
	

}
