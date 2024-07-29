package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//parent to child
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoSalesManager");
		
		
		
		
	}

}
