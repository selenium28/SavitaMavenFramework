package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class DashBoardPAge extends BaseClass{
	
	@FindBy(xpath = "(//*[text()='Dashboard'])[2]")
	WebElement dashBoard_Title;
	
	@FindBy(xpath = "//*[text()='Admin']")
	WebElement admin_SubMenu;
	
	
	public DashBoardPAge(){
		PageFactory.initElements(driver, this);
	}
	
	public void dashBoardTitle() {
		dashBoard_Title.isDisplayed();
		System.out.println("DashBoard Title displayed");
	}
	
	public void adminSubMenu() {
		admin_SubMenu.click();
		System.out.println("Admin sub Menu clicked");
	}
	

}
