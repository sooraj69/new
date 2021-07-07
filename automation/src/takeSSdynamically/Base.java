package takeSSdynamically;

import java.io.File;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base {
	
	static WebDriver driver;
	
	public static void initialization() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicitlywait
		driver.manage().window().maximize();// maximize the browser
		driver.get("http://desktop-qu5mob9/login.do");// launch the web application
		
	}
	
	public void fail(String methodName) {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/"+methodName+".jpg");
			Files.copy(src, dest);
		} catch (Exception e) {
		
		}
			
	}
}