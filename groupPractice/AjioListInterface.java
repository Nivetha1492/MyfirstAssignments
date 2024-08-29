package groupPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AjioListInterface {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//search bags and click enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(3000);
		
		//click men under gender
		
		driver.findElement(By.xpath("(//ul[@class='rilrtl-list ']/li)[3]/div")).click();
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(3000);
		//click fashion bags under category
		driver.findElement(By.xpath("(//ul[@class='rilrtl-list '])[3]/li[3]/div")).click();
		
		//print the count of items displayed
		String itemCount = driver.findElement(By.xpath("(//ul[@class='rilrtl-list '])[3]/li[3]/div//label")).getText();
		
		System.out.println(itemCount);
		
		//Get the list of brand of the products displayed in the page and print the list
		
		List<WebElement> productList = driver.findElements(By.xpath("//a[@class='rilrtl-products-list__link desktop']//div[@class='brand']"));
		
		System.out.println("The list of brands names are:");
		
		for(int i=0; i<productList.size(); i++) {
			
			System.out.println(productList.get(i).getText());
		}
	
		System.out.println("-----------------------");
		
		//Get the list of names of the bags and print it
		
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		System.out.println("The Name of bags are:");
		
		for(int i=0; i<bagNames.size(); i++) {
			
			System.out.println(bagNames.get(i).getText());
		}
		
		
	}

}
