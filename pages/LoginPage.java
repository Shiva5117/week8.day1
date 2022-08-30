package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	//Enter Username
	public LoginPage enterUsername(String username) {
		getDriver().findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	//Enter Password
	public LoginPage enterPassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	//Click on Login
	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}
