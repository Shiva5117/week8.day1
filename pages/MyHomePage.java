package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyLeadsPages cilckLead(){
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPages();
	}
	
	public ContactPages clickContact() {
		getDriver().findElement(By.linkText("Contacts")).click();
		return new ContactPages();
	}

}
