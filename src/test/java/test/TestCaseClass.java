package test;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.AdminPage;
import pages.DashBoardPAge;
import pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCaseClass extends BaseClass{
	LoginPage objLoginPage;
	DashBoardPAge objDashBoardPAge;
	AdminPage objAdminPage;
	
  @Test (priority = 1)
  public void loginTestCase() {
	  String username = "Admin";
	  String password = "admin123";
	  
	  objLoginPage = new LoginPage();
	  objLoginPage.userName(username);
	  objLoginPage.password(password);
	  objLoginPage.loginButton();  
	  System.out.println("Login Successfully");
  }
  
  @Test (priority = 2)
  public void dashboardTestCase() {
	  objDashBoardPAge = new DashBoardPAge();
	  objDashBoardPAge.dashBoardTitle();
	  objDashBoardPAge.adminSubMenu();  
	  System.out.println("Dashboard testcase passed");
  }
  
  @Test (priority = 3)
  public void adminTestCase() {
	  String name = "Savita";
	  
	  objAdminPage = new AdminPage();
	  objAdminPage.adminUserManagementTitle();
	  objAdminPage.adminUsername(name);
	  System.out.println("Admin test case passed");
  }
  
  @BeforeTest
  public void beforeTest() {
	  setup();
  }

  @AfterTest
  public void afterTest() {
	  teardown();
  }

}
