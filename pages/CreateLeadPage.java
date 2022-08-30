package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage enterCompname(String company){
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fname){
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lname){
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	
	public ViewLeadPage clickCreateButton(){
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}
