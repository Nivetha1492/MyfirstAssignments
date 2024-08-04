package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click show button
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//transfer focus to alert box
		
		Alert promptAlert = driver.switchTo().alert();
		
		String promptAlertText = promptAlert.getText();
		
		System.out.println("prompt Alert Text is:" +promptAlertText);
		
		Thread.sleep(2000);
		
		//enter value in text field
		
		promptAlert.sendKeys("Nivetha");
		
		Thread.sleep(5000);
		
		promptAlert.accept();
		
		String finaltext = driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println(finaltext);
		
		
		
		
		
		
	}

}
