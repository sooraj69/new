package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Rpol {
		WebDriver driver;
	
	public static void main(String[] args) {
		WebDriver driver;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter browser name");
		String browserValue = obj.next();

		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("Webdriver.Chrome.driver","./drivers/chromedriver.exe");
			driver.manage().window().maximize();
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com");

		}
		else if (browserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");

		}
		else
		{
			System.out.println("enter valid name");
		}
	}
	

}
