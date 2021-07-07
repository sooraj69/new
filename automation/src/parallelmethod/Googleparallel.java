package parallelmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Googleparallel {

	public class Methodparallel {
		WebDriver driver;
		  @Test
		  public void method1() 
		  {
			  	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("http://www.google.com");
				driver.switchTo().activeElement().sendKeys("mumbai");
				//Reporter.log("i am from 1"+Thread.currentThread().getId(),true);
		  }
		  
		  @Test
		  public void method2()
		  {
			  	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("http://www.google.com");
				driver.switchTo().activeElement().sendKeys("pune");
			 }

	}

}
