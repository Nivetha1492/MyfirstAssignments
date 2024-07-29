package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		
		//launch url
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.findElement(By.xpath("//input[@placeholder='Search for city']")).sendKeys("Chennai");
		
		//click location chennai
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		
		//click cinema under quick book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		//select Your cinema
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(2000);
		
		//select cinema theater
		driver.findElement(By.xpath("//span[contains(text(),'INOX Chennai Citi Centre')]")).click();
		Thread.sleep(3000);
		
		
		//choose tommorow
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(3000);
		
		//click movie
		//driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
		
		
		Thread.sleep(3000);
		
		//select your movie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[2]")).click();
		Thread.sleep(5000);
		
		//select show timing
		
		//driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
	
		//select 01.10pm
		
		driver.findElement(By.xpath("//span[contains(text(),'01:10 PM')]")).click();
		Thread.sleep(3000);
		
		//click book button
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//click Accept
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(2000);
		
		//click terms and conditions
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//click available seat
		
		driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
		
		//print booking summary
		
		String summary = driver.findElement(By.xpath("//div[@class='summary-movies-content']")).getText();
		System.out.println("Booking Summary:" +summary);
		
		//print seat number
		
		String seatno = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("booking seat number:" +seatno);
		
		//print Total
		
		String totalprice = driver.findElement(By.className("grand-price")).getText();
		System.out.println("Total Price Amount:"+totalprice );
		
		//click proceed button
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		
		//print grand total
		
		String grandtotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//following::span")).getText();
		System.out.println("Grand Total:" +grandtotal);
		
		if(totalprice.contains(grandtotal))
		{
			System.out.println("Both total price and Grand total are same");
		}
		
		else
		{
			System.out.println("not equal");
		}
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		
		driver.close();				
	}

}
