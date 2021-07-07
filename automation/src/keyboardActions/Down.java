package keyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Down {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Thread.sleep(2000);
		WebElement Target = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.contextClick(Target).perform();
		Thread.sleep(2000);
		Robot Down = new Robot();
		
		Down.keyPress(KeyEvent.VK_DOWN);
		Down.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		for(int i=0;i<6;i++)
		{
			Thread.sleep(2000);
		Down.keyPress(KeyEvent.VK_DOWN);
		Down.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		//Down.keyPress(KeyEvent.VK_DOWN);
		//Down.keyRelease(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		Down.keyPress(KeyEvent.VK_ENTER);
		Down.keyRelease(KeyEvent.VK_ENTER);

		

	}

}
