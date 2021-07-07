package dataParameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Actitime {
	
	WebDriver driver;
	@Parameters({"username","password","browser"})
	@Test
	
	public void acti(String user, String psw,String browserValue) {
	
		if(browserValue.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://desktop-qu5mob9/login.do");
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(psw);
		driver.findElement(By.id("loginButton")).click();
		
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://desktop-qu5mob9/login.do");
			driver.findElement(By.name("username")).sendKeys(user);
			driver.findElement(By.name("pwd")).sendKeys(psw);
			driver.findElement(By.id("loginButton")).click();
				
			
		}
		else
		{
			Reporter.log("Invalid");
		}
		
	}

}
