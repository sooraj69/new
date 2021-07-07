package Synchro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://desktop-qu5mob9/login.do");
		
		
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals("actiTIME - Login"))
		{
			System.out.println("the login page title is verifed...... passed");
		}
		
		else 
		{
			System.out.println("the login page title is verifed...... failed");
		
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String actualHomeTitle = driver.getTitle();
		
		if(actualHomeTitle.equals("actiTIME - Enter Time-Track"))
			{
		System.out.println("the homepage title is verified.....passed");	
				}
		
		else
		{
			System.out.println("the homepage title is not verified.....failed");
		}
		
	}

}
