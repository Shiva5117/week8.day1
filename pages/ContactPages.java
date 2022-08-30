package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ContactPages extends ProjectSpecificMethods{
	
	public MergeContactPage clickMergeContacts() {
		getDriver().findElement(By.linkText("Merge Contacts")).click();
		return new MergeContactPage();
	}

}
