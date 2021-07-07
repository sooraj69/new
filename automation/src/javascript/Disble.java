package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disble {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/sooraj/Desktop/wcsm5html/disale.html");//google
		Thread.sleep(2000);
		
	WebElement username = driver.findElement(By.id("i1"));
	WebElement pwd = driver.findElement(By.id("i2"));
	if(username.isEnabled())
	{
		username.sendKeys("suraj");
		
	}
	else
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('i1').value='suraj'");
		
	}
	if(pwd.isEnabled())
	{
		pwd.sendKeys("more");
	}
	else
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('i2').value='more'");
	
	
	
	}
}
}
