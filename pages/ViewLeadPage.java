package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage verifyFirstName(String fname) {
		String firstName = fname;
		String firstNAme = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(firstName, firstNAme);
		return this;
	}
	
	public FindLeadPage clickFindLeads() {
		
		getDriver().findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage();
	}
	
	public ViewLeadPage ClickEdit(String editCompany) {
		getDriver().findElement(By.linkText("Edit")).click();
		getDriver().findElement(By.id("updateLeadForm_companyName")).clear();
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys(editCompany);
		getDriver().findElement(By.name("submitButton")).click();
		return this;
	}
	
	public ViewLeadPage verifyCompany(String editCompany) {
			String company1 = editCompany+" ("+leadId+")";
			String company2 = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
			
			Assert.assertEquals(company1, company2);
			return this;
	}
	
	public FindLeadPage clickDelete() {
		getDriver().findElement(By.linkText("Delete")).click();
		return new FindLeadPage();
	}
	
	public void verifyMergeLead() {
		String title1 = "View Contact | opentaps CRM";
		String title2 = getDriver().getTitle();
		Assert.assertEquals(title1, title2);
	}
	
	

}
