package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MergeContactPage extends ProjectSpecificMethods{
	
	public FindContactPage clickFromWidget() {
		getDriver().findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following::a")).click();
		return new FindContactPage();
	}
	
	public FindContactPage clickToWidget() {
		getDriver().findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following::a")).click();
		return new FindContactPage();
		
	}
	
	public ViewLeadPage clickMerge() {
		getDriver().findElement(By.linkText("Merge")).click();
		getDriver().switchTo().alert().accept();
		return new ViewLeadPage();
	}

}
