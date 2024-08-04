package week3day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindowHandling {


	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.irctc.co.in/");
		
		//to get the address of current window
		
		String parentwindowaddress = driver.getWindowHandle();
		
		System.out.println("parent address:"+parentwindowaddress);
		
		// to click Flights link
		
		driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
		
		//to get the address of all opened window
		
	    Set<String> allWindowAddress = driver.getWindowHandles();
	   
		System.out.println(allWindowAddress);   
		
		//to get parent title
		
		String parentTitle = driver.getTitle();
		
		System.out.println("parent Title is:" +parentTitle);
		
		//covert set into list (get(index) is not allowed is set-> so we are converting to list
		
		 //Index starts 0 in window handling
		
		List<String> allWindowList = new ArrayList<String>(allWindowAddress);
		
		driver.switchTo().window(allWindowList.get(1));
		
		//get the title of child page
		
		String childtitle = driver.getTitle();
		
		System.out.println("child window address:" +childtitle);
		
		//close -Child window closed but driver focus is in child window only
		driver.close();
		
		//switch back to parent window
		
		driver.switchTo().window(allWindowList.get(0));
		
		String parentWindow = driver.getTitle();
		
		System.out.println("parent window adress:" +parentWindow);
		 
		
	}

}
