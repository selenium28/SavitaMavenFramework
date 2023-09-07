package test;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCaseClass extends BaseClass{
	LoginPage objLoginPage;
	
  @Test
  public void testcases() {
	  objLoginPage = new LoginPage();
	  objLoginPage.userName();
	  objLoginPage.password();
	  objLoginPage.loginButton();
	  
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
