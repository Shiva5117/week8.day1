package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyMergeLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getData() {
		excelName = "MergeLeads";

	}
	
	@Test(dataProvider = "fetchdata")
	public void verifyMergelead(String username, String password) {
		
		LoginPage ml = new LoginPage();
		ml.enterUsername(username).enterPassword(password).clickLogin().clickCrmSfa().clickContact().clickMergeContacts()
		.clickFromWidget().goToWindow1().clickToWidget().goToWindow2().clickMerge().verifyMergeLead();
	}

}
