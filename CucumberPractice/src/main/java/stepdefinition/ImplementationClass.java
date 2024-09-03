package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplementationClass {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //enter username
	    driver.findElement(By.id("username")).sendKeys("vinothkumar@testleaf.com");
	    
	    //enter password
	    driver.findElement(By.id("password")).sendKeys("SeleniumChallenge@24");
	    
	    driver.findElement(By.id("Login")).click();
	    
	    //Click the App Launcher Icon next to Setup

	    WebElement menuIcon = driver.findElement(By.xpath("//button[@title='App Launcher']"));
	    
	    driver.executeScript("arguments[0].click()", menuIcon);
	    
	    Thread.sleep(3000);
	    
	    //click search bar
	    
	    WebElement search = driver.findElement(By.xpath("(//input[@type='search'])[3]"));
	    
	    //enter accounts
	    
	    JavascriptExecutor js1 = (JavascriptExecutor)driver; 
	    js1.executeScript("arguments[0].value='Accounts';",search);
	    Thread.sleep(3000);
	    
	    //click on search bar
	    
	    WebElement accountSearch = driver.findElement(By.xpath("//input[@type='search']"));
	    
	    
	    //Search for the account using your unique account name
	    
	    JavascriptExecutor js2 = (JavascriptExecutor)driver; 
	    js2.executeScript("arguments[0].value='nivetha';",accountSearch);
	    Thread.sleep(3000);
	 
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
	}

}
