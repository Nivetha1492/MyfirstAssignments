package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ClickNewIndividual extends BaseClass {

	public CreateNewIndividual clicknew() {
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		return new CreateNewIndividual();
		

	}
}
