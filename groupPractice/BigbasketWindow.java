package groupPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BigbasketWindow {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.bigbasket.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click shop by category
		
		WebElement category = driver.findElement(By.xpath("(//span[text()='Shop by'])[2]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(category).click().perform();
		
		act.pause(60); 
		
		//click foodgrains,oil and masala;
		
		WebElement food = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		
		act.moveToElement(food).perform();
		
		act.pause(60);
		
		//mouse hover rice and rice products
		
		WebElement rice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		
		act.moveToElement(rice).perform();
		
		act.pause(60);
		
		//mouse hover boiled and steamed rice
		
		WebElement boiled = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		
		act.moveToElement(boiled).click().perform();
		
		//choose BB Royal in Brands 
		
		WebElement brands = driver.findElement(By.xpath("//label[text()='BB Royal']/preceding-sibling::input"));
		
		driver.executeScript("arguments[0].click()", brands);
		
		//choose tamil ponni boiled rice
		
		driver.findElement(By.xpath("//img[@title='bb Royal Tamil Ponni Boiled Rice 26 kg Bag']")).click();
		
		//handle window
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows);
		
		//convert set to list
		
		List<String> childWindow = new ArrayList<String>(windows);
		
		//changing focus to child window
		
		driver.switchTo().window(childWindow.get(1));		
		
		//select 5kg
		
	    WebElement fiveKg = driver.findElement(By.xpath("//span[text()='5 kg']"));
	    
	    act.moveToElement(fiveKg).click().perform();
	    
	    //print price
	    
	    WebElement price = driver.findElement(By.xpath("//table/tr[1]/td[1]"));
	    
	    System.out.println(price.getText());
	    
	    // Add to cart
	    
	    driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
	    
	    //take screenshot
	    
	    //source file
	    
	    File source = driver.getScreenshotAs(OutputType.FILE);
	    
	    // adding destination
	    
	    File destination = new File("./snapshot/sample.jpg");
	    
	    //copy file
	    
	    FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
	
		
		
		
		
			
	}

}
