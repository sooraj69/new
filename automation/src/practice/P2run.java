package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P2run {
static WebDriver driver;
	public static void main(String[] args) {
		Scanner obj1= new Scanner(System.in);
		System.out.println("Enter browser name");
		String browserValue=obj1.next();
		
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
		}
		else
		{
			System.out.println("entervalid name");
			
		}
	}

}
