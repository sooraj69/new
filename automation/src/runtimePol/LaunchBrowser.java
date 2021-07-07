package runtimePol;


import java.util.Scanner;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the browser name");
	String browserValue = sc.next();
	
	if(browserValue.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
	
		
		
		}
	
	else if(browserValue.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	}
	else
	{
		System.out.println("enter valid name");
		
	}
	}
}


