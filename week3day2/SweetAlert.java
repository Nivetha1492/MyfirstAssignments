package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click show button
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		Thread.sleep(2000);
		
		String displayText = driver.findElement(By.xpath("//span[text()='Are you sure you want to proceed?']")).getText();
		
		System.out.println("Alert display text is:" +displayText);
		
		//no need to transfer focus to alert box
		//take xpath for sweet alert it is inspectable
		
		WebElement clickOk = driver.findElement(By.xpath("//span[text()='Yes']"));
		
		clickOk.click();
		
		
		
		
	}

}
