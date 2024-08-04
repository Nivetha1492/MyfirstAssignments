package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("John");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Handle industry dropdown
		
		WebElement industrydropdown = driver.findElement(By.name("industryEnumId"));
		Select dropdown1 = new Select(industrydropdown);
		dropdown1.selectByVisibleText("Computer Software");
		
		//ownershipdropdown
		
		WebElement ownershipdropdown = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2 = new Select(ownershipdropdown);
		dropdown2.selectByVisibleText("S-Corporation");
		
		//sourcedropdown
		
		WebElement sourcedropdown = driver.findElement(By.id("dataSourceId"));
		Select dropdown3 = new Select(sourcedropdown);
		dropdown3.selectByValue("LEAD_EMPLOYEE");
		
		//Marketing Campaign dropdown
		
		WebElement Marketingdropdown = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4 = new Select(Marketingdropdown);
		dropdown4.selectByIndex(6);
		
		//state/province dropdown
		
		WebElement statedropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5 = new Select(statedropdown);
		dropdown5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
		
		
		
		
		  
		
		
	}

}
