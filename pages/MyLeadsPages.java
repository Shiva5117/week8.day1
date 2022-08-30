package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyLeadsPages extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLead(){
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

}
