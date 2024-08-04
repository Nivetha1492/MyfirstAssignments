package week3day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertW3scools {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//find frame
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		
		//switch to frame
		driver.switchTo().frame(frame1);
		
		//click try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Thread.sleep(2000);
		
		//click ok in popup
		Alert popupalert = driver.switchTo().alert();
		popupalert.accept();
		
		String display = driver.findElement(By.id("demo")).getText();
		
		System.out.println("display text is:" +display);
		
		if(display.contains("OK")) {
			System.out.println("clicked ok button from the alert");
		}
		else
		{
			System.out.println("clicked cancel button from the alert");
		}
		
	}
}

