package week3day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//WebElement iFrame = driver.findElement(By.tagName("iframe"));
		
		//step 1 Transfer the driver focus
		
		driver.switchTo().frame(0);
		
		//click the frame click me button
		
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		//driver.findElement(By.id("Click")).click();
		
		String buttonText1 = driver.findElement(By.xpath("//button[contains(text(),'Hurray! You Clicked')]")).getText();
		
		System.out.println(buttonText1);
		
		
		
		
		
		
				
	}

}
