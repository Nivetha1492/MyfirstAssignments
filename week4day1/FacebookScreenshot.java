package week4day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookScreenshot {

	public static void main(String[] args) throws IOException {

	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//step1: getscreenshot
		
		File facebookSouce = driver.getScreenshotAs(OutputType.FILE);
		
		//step2: add destination
		
		File facebookDestination = new File ("./snapshot/facebooksnap.png");
		
		//step3: connect source and destination
		
		FileUtils.copyFile(facebookSouce, facebookDestination);
		
		
		
	}

}
