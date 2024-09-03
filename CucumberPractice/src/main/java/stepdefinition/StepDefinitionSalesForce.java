package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionSalesForce extends BaseClass {
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		
		options = new ChromeOptions();
		driver= new ChromeDriver(options);
	}

	@Given("Load the url as {string}")
	public void load_the_url_as(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as(String username) {
		
		driver.findElement(By.id("username")).sendKeys(username);
	    
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
	    
	}

	@When("Click on login button")
	public void click_on_login_button() {
		
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
		
		@When("Click on toggle menu")
		public void click_on_toggle_menu() {
		    
			driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		}

		@When("Click view all button")
		public void click_view_all_button() {
			
			driver.findElement(By.xpath("//button[text()='View All']")).click();
		    
		}

		@When("Click sales")
		public void click_sales() {
		   
			WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
			driver.executeScript("arguments[0].click()", sales);//click using java script executor when element is not clicked
			
		}

		@When("Click accounts tab")
		public void click_accounts_tab() {
			
			WebElement accounts = driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
			driver.executeScript("arguments[0].click()", accounts);
			
		    
		}

		@When("Click new")
		public void click_new() {
			
			driver.findElement(By.xpath("//div[text()='New']")).click();
		    
			
		}

		@Given("Enter account name as {string}")
		public void enter_account_name_as(String accountname) {
			
			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accountname);
		}

		@Given("Choose ownership public")
		public void choose_ownership_public() {
			
			//dropdown click
			WebElement ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		    driver.executeScript("arguments[0].click()", ownership);
		    
		    //choose public from dropdown
		    driver.findElement(By.xpath("//span[text()='Public']")).click();
		}

		@When("Click save button")
		public void click_save_button() {
			
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();		    
		}

		@Then("Account should be created")
		public void account_should_be_created() {
			
			String profile = driver.findElement(By.xpath("//lightning-formatted-text[text()='nivetha']")).getText();
			
			if(profile.equals("nivetha")) {
				
				System.out.println("Profile matched");
			}
			else
			{
				System.out.println("Profile mismatched");
			}
		   
		}

	
	}




