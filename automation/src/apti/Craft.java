package apti;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Craft {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com/");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[contains(@placeholder,'Search For Products ,Brands & More' ) and @name='q'])[2]")).sendKeys("kurta",Keys.ENTER);
		  
		  WebElement target = driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-6 page-title']"));
		  
		  
		  Actions act = new Actions(driver);
		     
		        Robot robot = new Robot();
		        Thread.sleep(3000);
		  act.doubleClick(target).perform();
		  
		        Thread.sleep(4000);
//		        
		//    
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_C);
		        robot.keyRelease(KeyEvent.VK_C);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("(//input[contains(@placeholder,'Search For Products ,Brands & More' ) and @name='q'])[2]")).click();
		        Thread.sleep(2000);
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("(//input[@placeholder='Search For Products ,Brands & More'])[2]")).sendKeys("kurtas",Keys.ENTER);
		//Thread.sleep(2000);
		//WebElement target = driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-6 page-title']"));
		//Actions act = new Actions(driver);
		//act.doubleClick(target).perform();
		
		
		//doubleClick(target).perform();
		//click.doubleClick(target).perform();
		
		

		
	}

}
