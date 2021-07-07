package keyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Crafts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.google.com");//google
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);//google search
		//driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//Thread.sleep(2000);
	
		WebElement target = driver.findElement(By.xpath("//SPAN[.='Selenium']"));
		new Actions(driver).doubleClick(target).perform();//doubleclick
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);//copy
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Select the text from search box using double click and delete it
		WebElement target1 = driver.findElement(By.name("q"));
		new Actions(driver).doubleClick(target1).perform();
		Robot	act=new Robot();
	  act.keyPress(KeyEvent.VK_DELETE);
	  act.keyRelease(KeyEvent.VK_DELETE);
	  Thread.sleep(2000);
	  act.keyPress(KeyEvent.VK_CONTROL);
	  act.keyPress(KeyEvent.VK_V);
	  act.keyRelease(KeyEvent.VK_V);
	  act.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
