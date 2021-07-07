package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class P1run {

	static WebDriver driver;

public static void main(String[] args)
{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter browser name");
		String browserName = sc.next();
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	}
	else if (browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("WebDriver.Gecko.driver","./drivers/geckodriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	}
	else
	{
		System.out.println("entervalid");
	}
	}
	
}
	


