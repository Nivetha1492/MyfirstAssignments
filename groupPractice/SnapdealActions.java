package groupPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapdealActions {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click on men's fashion
		
		WebElement category = driver.findElement(By.xpath("//ul[@class='nav smallNav']/li"));
		
		category.click();
		
		WebElement footwear = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		
		//move hover action for sports shoe
		
		Actions act = new Actions(driver);
		
		act.moveToElement(footwear).click().perform();
		
		//count of sports shoes
		
		List<WebElement> shoeCount = driver.findElements(By.xpath("(//li[@class='child-cat-list cat-list '])[1]/a/div"));
		
		for(int i=0; i<shoeCount.size();i++)
		{
			System.out.println(shoeCount.get(i).getText());
		}
		
		//click on training shoes
		
		driver.findElement(By.xpath("//ul[@id='js-255-nav']/li")).click();
		
		//click sort by dropdown 
		
		driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']")).click();
		
		//select "Low to High" from sort by list
		
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		
		Thread.sleep(3000);
		
		//check displayed items are sorted correctly
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@id='products']"));
		
		System.out.println("The Product price are:");
		
		for(int i=0;i<price.size();i++) {
			
			System.out.println(price.get(i).getText()); //get(i) to get iterated value
		}
		
		//scroll down the page
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		// Select any price range (500-700)
		
		//start range 500
		WebElement startVal = driver.findElement(By.xpath("//input[@name='fromVal']"));
		startVal.clear();
		startVal.sendKeys("500");
		
		//ending range 700
		
		WebElement endVal = driver.findElement(By.xpath("//input[@name='toVal']"));
		endVal.clear();
		endVal.sendKeys("700");
		
		//click Go
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		Thread.sleep(3000);
		
		//filter by colour white & blue checkbox
		
		driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list '][2]")).click();
		
		//Verify all the applied filters (one filter displayed)
		
		List<WebElement> filters = driver.findElements(By.xpath("//div[@class='filters-top-selected']//div[@class='navFiltersPill']"));
		
		System.out.println("The Applied filters are:");
		
		for(int i=0;i<filters.size();i++) {
			
			System.out.println(filters.get(i).getText());
		}
		
		Thread.sleep(3000);		
		
		// Mouse hover on the first resulting "Training Shoes"
		
		WebElement firstshoe = driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]"));
		
		act.moveToElement(firstshoe).perform();
		
		Thread.sleep(3000);
		
		//click on quick view
		
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']")).click();		
		
		
		//Print the cost and the discount percentage
		
		List<WebElement> CostDiscount = driver.findElements(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix'])[1]/span"));
		
		System.out.println("cost and discount percentage:");
		
		for(int i=0; i<CostDiscount.size(); i++) {
			
			System.out.println(CostDiscount.get(i).getText());
		}
		
		//Take a snapshot of the shoes
		
		//source file
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		//adding destination
		
		File destination = new File("./snapshot/shoepic.jpeg");
		
		//copy file
		
		FileUtils.copyFile(source, destination);
		
		//close the current window
		driver.close();
		
		
	}

}
