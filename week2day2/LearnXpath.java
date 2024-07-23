package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//click login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		

	}

}
