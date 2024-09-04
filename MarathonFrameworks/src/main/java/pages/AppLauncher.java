package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class AppLauncher extends BaseClass {
	
	public ClickNewIndividual clickindividual() {
		
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		
		return new ClickNewIndividual();
	}

}
