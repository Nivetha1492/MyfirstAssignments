package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class Welcome extends BaseClass{

	public Welcome clicktogglebuttton() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;

	}
	
	public AppLauncher clickviewall() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return new AppLauncher();

	}
}
