package week3day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://leafground.com/table.xhtml");
		
		//locate the table
		
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		
		//Count the number of rows
		
		 List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		 
		 System.out.println("Row count is:" +rowCount.size());
		 
		 //count the number of columns
		 
		 List<WebElement> columncount = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
		 
		 System.out.println("Column count is:" +columncount.size());
		 
		//Retrieve a particular row value (2nd row)
		 
		 List<WebElement> secondRowValue = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
		 
		 int listSize = secondRowValue.size();
		 
		 for(int i=0;i<listSize;i++)
		 {
			 String secondRow = secondRowValue.get(i).getText();
			 System.out.println("Second row values:" +secondRow);
		 }
		 
		
	    //data from 3rd coulumn
		
		List<WebElement> columndata = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[3]"));
		
		for(int j=1;j<columndata.size();j++)
		{
			String thirdColumnData = columndata.get(j).getText();
			System.out.println("3rd coulumn values are:"+thirdColumnData);
		}
		
		
		//Retrieve the entire data in the webtable
		
		for(int k=1; k<rowCount.size();k++)
		{
			WebElement eachRow = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+k+"]/td"));
		
		for(int l=1; l<columncount.size();l++)
		{
			WebElement allValues = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+k+"]/td["+l+"]"));
			System.out.println("All data are:" +allValues.getText());
		}
			
			
			
		
		}
		
		
		
		
		
		
	}

}
