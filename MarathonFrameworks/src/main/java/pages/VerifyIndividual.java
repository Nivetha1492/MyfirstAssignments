package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class VerifyIndividual extends BaseClass {
	
	public void verify() {
		
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(message);
	}

}
