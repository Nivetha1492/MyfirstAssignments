package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StaticParameterStepDefinition extends BaseClass {
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		
		options = new ChromeOptions();
		driver= new ChromeDriver(options);
	    
	}
	
	@Given("Load the url {string}")
	public void load_the_url(String url) {

		driver.get(url);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	
	@Given("Enter the username {string}")
	public void enter_the_username(String username) {
		
		//enter username
	    driver.findElement(By.id("username")).sendKeys(username);
	   
	}
	
	@Given("Enter the password {string}")
	public void enter_the_password(String password) {
		
		//enter password
		driver.findElement(By.id("password")).sendKeys(password);
	
		
	}
	@When("Click the login button")
	public void click_the_login_button() {
		
		 driver.findElement(By.id("Login")).click();
	    
		
	}
	
	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
	  
		String Home = driver.findElement(By.xpath("(//span[text()='Home'])[3]")).getText();
		
		if(Home.equals("Home")) {
			System.out.println("Login Successful");
		}
		
		else 
		{
			System.out.println("Login failed");
		}
	}
	
	
	@When("Click the app launcher icon")
	public void click_the_app_launcher_icon() throws InterruptedException {
		
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
	   
	}
	
	
	@When("Click the accounts tab")
	public void click_the_accounts_tab() throws InterruptedException {
	    
		//click on Accounts search bar
	    
	    WebElement accountSearch = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
	    driver.executeScript("arguments[0].click()", accountSearch);
	    Thread.sleep(3000);
	    
	    //Search for the account using your unique account name 'nivetha' in account search
	    accountSearch.sendKeys("nivetha");
	    
	    //select account name nivetha
	    
	    driver.findElement(By.xpath("//a[text()='nivetha']")).click();
	    
	    //click profile dropdown
	    
	    WebElement ProfileDropdown = driver.findElement(By.xpath("//li[contains(@class,'click slds-button_last overflow')]"));
	    //driver.executeScript("arguments[0].click()", ProfileDropdown);
	    ProfileDropdown.click();
	    Thread.sleep(3000);
		
	}
	
	
	@When("Click the edit button")
	public void click_the_edit_button() throws InterruptedException {

		//select Edit
	    
	    driver.findElement(By.xpath("//span[text()='Edit']")).click();
	    
	    //scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
			
		
	}
	
	
	@When("Set type to technology partner")
	public void set_type_to_technology_partner() {
		
		//click type dropdownbox
		
		WebElement type = driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[2]"));
		driver.executeScript("arguments[0].click()", type);
						
		//Set Type to Technology Partner
						
		driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();

	    
	}
	@When("Set industry to healthcare")
	public void set_industry_to_healthcare() throws InterruptedException {
	 
	//click on industry dropdown
		
		driver.findElement(By.xpath("//button[@aria-label='Industry']")).click();	
		
		//scroll down
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,250)","");
				
		//Set Industry to Healthcare
				
		WebElement healthcare = driver.findElement(By.xpath("//span[@title='Healthcare']"));
		driver.executeScript("arguments[0].click()", healthcare);
		Thread.sleep(3000);
		
	   
	}
	
	@Given("Enter the billing address {string}")
	public void enter_the_billing_address(String billingaddress) throws InterruptedException {
		
		//Enter billing address
		
		WebElement billingAddress = driver.findElement(By.xpath("(//textarea[@autocomplete='street-address'])[1]"));
						
		billingAddress.clear();
						
		billingAddress.sendKeys(billingaddress);
					
		Thread.sleep(3000);
	    
	}
	
	@Given("Enter the shipping address {string}")
	public void enter_the_shipping_address(String shippingaddress) {
		
		//Enter shipping address
		
		WebElement shippingAddress = driver.findElement(By.xpath("(//textarea[@autocomplete='street-address'])[2]"));
						
		shippingAddress.clear();
						
		shippingAddress.sendKeys(shippingaddress);
						
			   
	    
	}
	@Given("Set customer priority to low")
	public void set_customer_priority_to_low() throws InterruptedException {
		
		//click priority dropdown
		
		WebElement priority = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
						
		driver.executeScript("arguments[0].click()", priority);
		
		Thread.sleep(3000);
						
		//Set Customer Priority to Low
						
		WebElement low = driver.findElement(By.xpath("(//span[text()='Low'])[1]"));
		driver.executeScript("arguments[0].click()", low);
		Thread.sleep(3000);
			   
		
	   
	}
	
	@Given("Set sla to silver")
	public void set_sla_to_silver() {
		
		//click on SLA field
		
		driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
						
		//Set SLA to Silver
						
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
	   
	}
	
	@Given("Set active to no")
	public void set_active_to_no() throws InterruptedException {
		
		//click Active field
		
		WebElement active = driver.findElement(By.xpath("//button[@aria-label='Active']"));
		driver.executeScript("arguments[0].click()", active);

		//Set Active to NO
						
		WebElement no = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']"));
		driver.executeScript("arguments[0].click()", no);
		Thread.sleep(3000);

			   
	  
	}
	
	
	@Given("Enter unique phone number {string}")
	public void enter_unique_phone_number(String phonenumber) {
	    

		//Enter a unique number in the Phone field
		WebElement phone = driver.findElement(By.xpath("//input[@name='Phone']"));
		phone.clear();
		phone.sendKeys(phonenumber);
	}
	
	@Given("Enter upsell opportunity to no")
	public void enter_upsell_opportunity_to_no() {
		
		//click upsell opportunity field
		
		WebElement upsell = driver.findElement(By.xpath("//div[@aria-label='Upsell Opportunity']"));
						
		driver.executeScript("arguments[0].click()", upsell);
						
		//Set Upsell Opportunity to No
						
		driver.findElement(By.xpath("(//span[text()='No'])[1]")).click();
	    
	}
	
	@When("click save button")
	public void click_save_button() throws InterruptedException {
		
	//Click Save
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		
		//scroll up
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, -250);");
		
		
	    
	}
	
	@Then("Verify phone number")
	public void verify_phone_number() {
		
		
		//verify the phone number
		
		WebElement phoneNumber = driver.findElement(By.xpath("//a[text()='9500804268']"));
		driver.executeScript("arguments[0].click()", phoneNumber);
	
		String verify = phoneNumber.getText();
		
		System.out.println(verify);
		
		if(verify.equals("9500804268")) {
			
			System.out.println("phone number verified successfully");
		}
		
		else
		{
			System.out.println("invalid phone number");
		}
	    
	}

}
