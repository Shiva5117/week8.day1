package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyDeleteLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getData() {
		excelName = "FindLeads";

	}
	
	@Test(dataProvider = "fetchdata")
	public void verifyfindLead(String username, String password, String fname, String lname, String company, String searchFirstName,
			String editCompany) throws IOException {
		
		LoginPage fl = new LoginPage();
		fl.enterUsername(username).enterPassword(password).clickLogin().clickCrmSfa().cilckLead()
		.clickCreateLead().enterFirstName(fname).enterLastName(lname).enterCompname(company).clickCreateButton()
		.clickFindLeads().findLead(searchFirstName).clickFirstLead().ClickEdit(editCompany).verifyCompany(editCompany).clickDelete()
		.verifyDeleted();
		
	}

}
