package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class FindContactPage extends ProjectSpecificMethods{
	
	public MergeContactPage goToWindow1() {
		Set<String> windows = getDriver().getWindowHandles();
		List<String> wIndows = new ArrayList<String>(windows);
		getDriver().switchTo().window(wIndows.get(1));
		getDriver().findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		getDriver().switchTo().window(wIndows.get(0));
		return new MergeContactPage();
	}
	
	public MergeContactPage goToWindow2() {
		Set<String> windows = getDriver().getWindowHandles();
		List<String> wIndows = new ArrayList<String>(windows);
		getDriver().switchTo().window(wIndows.get(1));
		getDriver().findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		getDriver().switchTo().window(wIndows.get(0));
		return new MergeContactPage();
	}

}
