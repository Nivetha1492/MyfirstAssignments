package groupPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter from station
		WebElement fromSearch = driver.findElement(By.id("txtStationFrom"));
		fromSearch.clear();
		
		//search MAS
		fromSearch.sendKeys("MAS");
		
		//Select chennai
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		
		//enter to station
		WebElement toSearch = driver.findElement(By.id("txtStationTo"));
		toSearch.clear();
		
		//send input CBE
		toSearch.sendKeys("CBE");
		driver.findElement(By.xpath("//div[text()='Coimbatore Jn']")).click();
		
		//Deselect checkbox
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr"));
		System.out.println("The Number of rows:" +rows.size());
		

		//To fetch 2nd column data
		List<WebElement> secondColumn = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]"));
		System.out.println("The Train names are:");
		
		//train name list
		List<String> trainNames = new ArrayList<String>(); //empty list
		
		
		for(int i=0; i<secondColumn.size(); i++) {
		
			String columntext = secondColumn.get(i).getText();
			trainNames.add(columntext);	
			}
		
		for (String train : trainNames) {
			
			System.out.println(train);
			
		}
		

	}

}


