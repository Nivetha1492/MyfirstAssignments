package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click show button
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//transfer focus to alert box
		
		Alert confirmAalert = driver.switchTo().alert();
		
		confirmAalert.accept();
		
		Thread.sleep(2000);
		
		//confirmAalert.dismiss();
		
		String confirmtext = driver.findElement(By.id("result")).getText();
		
		System.out.println(confirmtext);
		
		
		
		
		
		
		
	}

}
