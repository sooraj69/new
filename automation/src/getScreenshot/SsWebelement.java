package getScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SsWebelement {

	
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
			ChromeDriver driver=new ChromeDriver();// launch the chrome browser
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//google
			Thread.sleep(2000);
			WebElement target = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
			
			File src = target.getScreenshotAs(OutputType.FILE);
					  File dest = new File("./screenshots/web.png");
					 Files.copy(src, dest);
		}

}
