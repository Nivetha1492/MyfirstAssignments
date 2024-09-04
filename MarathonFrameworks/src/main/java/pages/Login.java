package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class Login extends BaseClass{
	
	
	public Login username(String username) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		return this;

	}
	
	public Login password(String password) {
	
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
		
	}

	
	public Welcome clicklogin() {
		
		driver.findElement(By.id("Login")).click();
		return new Welcome();

	}
}
