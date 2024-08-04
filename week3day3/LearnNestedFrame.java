package week3day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//handling outer frame
		
		WebElement outerFrame = driver.findElement(By.xpath("//h5[contains(text(),'Inside Nested frame')]/following::iframe"));
				
		//Transfer the driver focus to outer frame    
				
		driver.switchTo().frame(outerFrame);
				
		//transfer the driver focus to inner frame
				
		driver.switchTo().frame("frame2");
				
		// click the nested frame button
				
		driver.findElement(By.id("Click")).click();
		
		String buttonClicked = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
				
		System.out.println(buttonClicked);
		
		
	}

}
