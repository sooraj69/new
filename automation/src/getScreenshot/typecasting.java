package getScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class typecasting {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		TakesScreenshot ts = (TakesScreenshot)driver;
	
		 File src = ts.getScreenshotAs(OutputType.FILE);		
		 	File dest = new File("./screenshots/4th.png");
		 Files.copy(src, dest);
		 
	}

}
