package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomepage() {
		
		String title1 = "Leaftaps - TestLeaf Automation Platform";
		String title2 = getDriver().getTitle();
		Assert.assertEquals(title1, title2);
		return this;

	}
	
	public MyHomePage clickCrmSfa(){
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
