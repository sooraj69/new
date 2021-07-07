package testNGforapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
	@Test
  public void login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
   }
	
	@Test
	  public void loginInvalid() {
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("managsr");
			driver.findElement(By.id("loginButton")).click();
	   }
	
	
	
	
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get("http://desktop-qu5mob9/login.do");
	   }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  }

  @AfterTest
  public void afterTest() {
  Reporter.log("generate the report",true);
  }

}
