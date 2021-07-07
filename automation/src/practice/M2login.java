	package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2login {

	public static void main() throws InterruptedException
	{
		System.setProperty("webdrivers.chrome.driver", "./drivers/Chrome.exe");
		ChromeDriver drivers = new ChromeDriver();
		drivers.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		drivers.manage().window().maximize();
		drivers.get("https://www.instagram.com/");
		drivers.findElement(By.name("username")).sendKeys("srjmore232@gmail.com");
		Thread.sleep(2000);
		
		drivers.findElement(By.name("password")).sendKeys("ascdwe");
		drivers.findElement(By.xpath("(//div[contains(@class,'eGOV_')])[2]")).click();
		
		
	
	}
}
