package getScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Event {

	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
			ChromeDriver driver=new ChromeDriver();// launch the chrome browser
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//google

			EventFiringWebDriver event = new EventFiringWebDriver (driver);
			File src = event.getScreenshotAs(OutputType.FILE);
			File des = new File("./screenshots/event.png");
		    Files.copy(src, des);
		}

}
