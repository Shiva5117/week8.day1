package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyFirstName extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getData() {
		excelName = "CreateLead";

	}
	
	@Test(dataProvider = "fetchdata")
	public void verifyFirstname(String username, String password, String fname, String lname, String company) throws IOException {
		
		LoginPage cl = new LoginPage();
		cl.enterUsername(username).enterPassword(password).clickLogin()
		.clickCrmSfa().cilckLead().clickCreateLead().enterFirstName(fname)
		.enterLastName(lname).enterCompname(company).clickCreateButton().verifyFirstName(fname);
		
	}

}
