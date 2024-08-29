package groupPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://finance.yahoo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		
		// click Markets
		
		WebElement markets = driver.findElement(By.xpath("//span[text()='Markets']"));
		
		act.moveToElement(markets).perform();  //move hover action
		
		act.pause(30); // pause the action 
		
		//click crypto
		
		WebElement crypto = driver.findElement(By.xpath("(//div[text()='Crypto'])[2]"));
		
		crypto.click();
		
		//inspect table
		
		WebElement table = driver.findElement(By.xpath("//h2[text()='Crypto']/following::div[2]"));
		
		//count number of rows
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));	
		
		System.out.println("The number of rows:" +rows.size());
		
		//number of columns
		
		List<WebElement> columns = table.findElements(By.tagName("th"));
		
		System.out.println("The number of columns:" +columns.size());
		
		//  retrive currency column
		
		for(int i=1; i<=rows.size(); i++) {
			
			List<WebElement> currency = table.findElements(By.xpath("//table/tbody/tr/td[1]"));
			
			String text = currency.get(i).getText();
			
			System.out.println(text);
		}
			
			 //to retrive entire data
			
			System.out.println("All datas are:");
			
			for(int i=1; i<=rows.size(); i++) {
			
			WebElement eachRow = table.findElement(By.xpath("//table/tbody/tr["+i+"]/td"));
				
				
			for(int j=1; j<=columns.size(); j++) {
				
			WebElement allValues = table.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				
			System.out.println(allValues.getText() );
			}
			
			} 
			
		}
	}


		
		
		
		
		
		
		
			
		
		





		
		
		
		     
		
		

