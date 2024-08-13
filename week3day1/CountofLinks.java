package week3day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofLinks {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//to get the count of all links
		
		int linkSize = allLinks.size();
		
		System.out.println("Total links present in Facebook are:" +linkSize);
		
		//convert to values from address
		
		List<String> allLinksText = new ArrayList<String>(); // creating blank list	
		
		//System.out.println(allLinksText); // it will print blank array
		
		for(int i=0; i<=linkSize-1; i++) {
			
			String result = allLinks.get(i).getText(); //get method will retrive the html tags and getText will retrive the text from tag
			
			System.out.println("Link are:" +i+ "-" +result);
			
			allLinksText.add(result); // adding address value or Label to new list
			
		}
		
		String dd= allLinksText.get(15);
		System.out.println("After adding to StringList--"+ dd);

		driver.close();
		
		
	}

}
