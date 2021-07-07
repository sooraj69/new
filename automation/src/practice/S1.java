package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S1 {
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the browser name");
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flikart.com");
			
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			
		}
		else
		{
			System.out.println("enter valid name");
		}
	}
	
	

}
