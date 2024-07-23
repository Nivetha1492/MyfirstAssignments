package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchLeaftabs {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		//enter username
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//enter password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click link text
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click leads tab
		
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead tab
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//enter first name
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nivetha");
		
		//enter last name
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sivakumar");
		
		//step 1. find element
		//step 2. return type of findelement is webelement
		
		WebElement sourcedropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(sourcedropdown);
		
		//select by index
		//dropdown1.selectByIndex(5);
		
		//select by value
		//dropdown1.selectByValue("LEAD_TRADESHOW");
		
		//select by visible text
		dropdown1.selectByVisibleText("Public Relations");
		
		WebElement industrydropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2 = new Select(industrydropdown);
		dropdown2.selectByValue("IND_TELECOM");
		
		WebElement ownershipdropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown3 = new Select(ownershipdropdown);
		dropdown3.selectByVisibleText("Public Corporation");

		
		
	}

}
