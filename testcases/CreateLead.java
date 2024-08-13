package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	//Dynamic data parameterization
	
	@DataProvider(name="FetchData")
	public String [][] sendData()  //method name
	{
		
		String[][] data = new String [2][3];
		data[0][0] = "Testleaf";
		data[0][1] = "Hari";
		data[0][2] = "R";
		
		data[1][0] = "Qeagle";
		data[1][1] = "Vineeth";
		data[1][2] = "Rajendran";
		
		return data;
		
	
	}
	

	@Test(dataProvider ="FetchData")
	
	public void runCreateLead(String cName, String fName, String lName)  {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






