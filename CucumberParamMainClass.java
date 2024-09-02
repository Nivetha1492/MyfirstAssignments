package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CucumberParamMainClass {

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
	    
	    WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']"));
	    driver.executeScript("arguments[0].click()",search);
	    Thread.sleep(3000);
	    
	    //enter Account
	    search.sendKeys("Accounts");
	    
	    //select accounts
	    driver.findElement(By.xpath("//b[text()='Accounts']")).click();	    
	   
	    //JavascriptExecutor js1 = (JavascriptExecutor)driver; 
	    //js1.executeScript("arguments[0].value='Accounts';",search);
	    //Thread.sleep(3000);
	    
	    
	    //click on Accounts search bar
	    
	    WebElement accountSearch = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
	    driver.executeScript("arguments[0].click()", accountSearch);
	    Thread.sleep(3000);
	    
	    //Search for the account using your unique account name 'nivetha' in account search
	    accountSearch.sendKeys("nivetha");
	    
	    //select account name nivetha
	    
	    driver.findElement(By.xpath("//a[text()='nivetha']")).click();
	    
	    
	    //(instead og sendkeys) Search for the account using your unique account name
	    
	   // JavascriptExecutor js2 = (JavascriptExecutor)driver; 
	   // js2.executeScript("arguments[0].value='nivetha';",accountSearch);
	   //Thread.sleep(3000);
	 
	    //click profile dropdown
	    
	    WebElement ProfileDropdown = driver.findElement(By.xpath("//li[contains(@class,'click slds-button_last overflow')]"));
	    //driver.executeScript("arguments[0].click()", ProfileDropdown);
	    ProfileDropdown.click();
	    Thread.sleep(3000);
	    
	    //select Edit
	    
	    driver.findElement(By.xpath("//span[text()='Edit']")).click();
	    
	     
	   //scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
			
		//click type dropdownbox
		
		WebElement type = driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[2]"));
		driver.executeScript("arguments[0].click()", type);
		
		//Set Type to Technology Partner
		
		driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
	    
		 //click on industry dropdown
		
		driver.findElement(By.xpath("//button[@aria-label='Industry']")).click();	
		
		//scroll down
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,250)","");
		
		//Set Industry to Healthcare
		
		WebElement healthcare = driver.findElement(By.xpath("//span[@title='Healthcare']"));
		driver.executeScript("arguments[0].click()", healthcare);
		Thread.sleep(3000);
	    
		//Enter billing address
		
		WebElement billingAddress = driver.findElement(By.xpath("(//textarea[@autocomplete='street-address'])[1]"));
		
		billingAddress.clear();
		
		billingAddress.sendKeys("506B kumaranstreet");
	
		Thread.sleep(3000);
	
		
		//Enter shipping address
		
		WebElement shippingAddress = driver.findElement(By.xpath("(//textarea[@autocomplete='street-address'])[2]"));
		
		shippingAddress.clear();
		
		shippingAddress.sendKeys("506B kumaranstreet");
		
		//click priority dropdown
		WebElement priority = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
		
		driver.executeScript("arguments[0].click()", priority);
		Thread.sleep(3000);
		
		//Set Customer Priority to Low
		
		WebElement low = driver.findElement(By.xpath("(//span[text()='Low'])[1]"));
		driver.executeScript("arguments[0].click()", low);
		Thread.sleep(3000);
		
		//click on SLA field
		
		driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
		
		//Set SLA to Silver
		
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
		
		//click Active field
		
		WebElement active = driver.findElement(By.xpath("//button[@aria-label='Active']"));
		driver.executeScript("arguments[0].click()", active);

		//Set Active to NO
		
		WebElement no = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']"));
		driver.executeScript("arguments[0].click()", no);
		Thread.sleep(3000);
		
		//Enter a unique number in the Phone field
		WebElement phone = driver.findElement(By.xpath("//input[@name='Phone']"));
		phone.clear();
		phone.sendKeys("9500804268");
		
		
		//click upsell opportunity field
		
		WebElement upsell = driver.findElement(By.xpath("//div[@aria-label='Upsell Opportunity']"));
		
		driver.executeScript("arguments[0].click()", upsell);
		
		//Set Upsell Opportunity to No
		
		driver.findElement(By.xpath("(//span[text()='No'])[1]")).click();
		
		//Click Save
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		
		//verify the phone number
		
		WebElement phoneNumber = driver.findElement(By.xpath("//a[text()='9500804268']"));
		driver.executeScript("arguments[0].click()", phoneNumber);
	
		String verify = phoneNumber.getText();
		
		System.out.println(verify);
		
		//if(verify.equals("9500804268")) {
			
		//	System.out.println("phone number verified successfully");
		//}
		
		//else
		//{
		//	System.out.println("invalid phone number");
		//}
		
		
		}

	}

