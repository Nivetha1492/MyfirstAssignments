package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLaunch {

	public static void main(String[] args) {

	//launch chrome browser
	ChromeDriver driver = new ChromeDriver();
	
	//get url
	driver.get("https://www.facebook.com/");
	
	//maximize browser
	driver.manage().window().maximize();
	
	//enter email id
	driver.findElement(By.id("email")).sendKeys("nivethanive93@gmail.com");
	
	//enter password
	driver.findElement(By.id("pass")).sendKeys("johnive14$");
	
	//click login button
	driver.findElement(By.name("login")).click();
	
	driver.close();
		
		
		
		
		
	}

}
