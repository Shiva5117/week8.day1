package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{
	
	public FindLeadPage findLead(String searchFirstName) {
		getDriver().findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(searchFirstName);
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public ViewLeadPage clickFirstLead() {
		leadId = getDriver().findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		getDriver().findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		return new ViewLeadPage();
	}
	
	public void verifyDeleted() {
		getDriver().findElement(By.linkText("Find Leads")).click();
		getDriver().findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = "No records to display";
		String text1 = getDriver().findElement(By.xpath("//div[text()='No records to display']")).getText();
		Assert.assertEquals(text, text1);
		
	}

}
