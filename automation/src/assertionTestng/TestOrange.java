package assertionTestng;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestOrange {
	WebDriver driver;
	@Test
	public void orange() throws InterruptedException {
	  		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			String loginpage = driver.getTitle();
			SoftAssert softassert = new SoftAssert();
			softassert.assertEquals(loginpage, "OrangeHRM");
			WebElement usn = driver.findElement(By.name("txtUsername"));
			boolean statusofusn = usn.isDisplayed();
			
			Assert.assertEquals(statusofusn, true);
			
			WebElement pass = driver.findElement(By.name("txtPassword"));
			boolean statusofpass = pass.isDisplayed();
			
			Assert.assertEquals(statusofpass, true);
			
			WebElement login = driver.findElement(By.name("Submit"));
			boolean statusoflogin =login.isDisplayed();
			
			Assert.assertEquals(statusoflogin, true);
			
			usn.sendKeys("Admin");
			pass.sendKeys("admin123");
			login.click();
			
			Thread.sleep(3000);
			
			String homepage = driver.getTitle();
			softassert.assertEquals(homepage, "OrangeHRMHomePage");
			
			Reporter.log("create the user",true);
			Reporter.log("create the settings",true);
			
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.xpath("//a[.='Logout']")).click();
			softassert.assertAll();		
	}

}
