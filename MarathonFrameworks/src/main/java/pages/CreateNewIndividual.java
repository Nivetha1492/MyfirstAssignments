package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateNewIndividual extends BaseClass {
	
	public CreateNewIndividual entername(String name) {
		
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(name);
		
		return this;
	}
		
		public VerifyIndividual clickSave() {
			
			driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
			
			return new VerifyIndividual();

		}
		
		

	}


