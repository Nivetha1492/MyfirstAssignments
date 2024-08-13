package week4day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//step 1: getScreenshot
		
		File screenshotSource = driver.getScreenshotAs(OutputType.FILE);
		
		//step2: Add Destination
		
		File destination = new File ("./snapshot/leaftapsloginpage.png");
		
		//step3: connect the source and destination
		
		FileUtils.copyFile(screenshotSource, destination);
		
		
		
	}

}
