package parallelmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class class2 {

	static WebDriver driver;
	  @Test
	  public void setUp() { 
		  	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("http://www.google.com");
				driver.switchTo().activeElement().sendKeys("csk");
	
	  }
	  @Test
	  public void tearDown()
	  {
		  driver.close();
	  }

}
