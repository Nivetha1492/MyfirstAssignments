package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonActionClass {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		
		driver.findElement(By.xpath("//input[@value='oneplus 9 pro']")).click();
		
		
		
	}

}
