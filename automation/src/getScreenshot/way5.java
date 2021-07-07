package getScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class way5 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
			RemoteWebDriver	RM=(RemoteWebDriver)driver;
			
		File src = RM.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/amazon.png");
			Files.copy(src,dest);
			
	}

}
