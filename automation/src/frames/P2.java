package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
	driver.manage().window().maximize();//maximize the browser
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	driver.switchTo().frame("chat-widget");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("name")).sendKeys("Suraj");
	driver.findElement(By.id("email")).sendKeys("suraj123@gmail.com");
	driver.findElement(By.xpath("//span[.='Leave a message']")).click();
	
	}

}
