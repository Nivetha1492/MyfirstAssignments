package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click show button
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Transfer driver focus to alert box
		
		Alert simpleAlert = driver.switchTo().alert();
		
		simpleAlert.accept();
		
		//get success text
		
		String Alerttext = driver.findElement(By.xpath("//span[text()='You have successfully clicked an alert']")).getText();
		
		System.out.println(Alerttext);
		
		
		
	
	
	
	}

}
