package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLoginPage extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getData() {
		excelName = "Login";

	}
	
	@Test(dataProvider = "fetchdata")
	public void verifyLoginPage(String username, String password) throws IOException {
		
		LoginPage login = new LoginPage();
		login.enterUsername(username).enterPassword(password).clickLogin().verifyHomepage().clickCrmSfa();
	}

}
