package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2 {
static WebDriver driver;
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("enter browaser name");
		String browserName = obj.next();
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			
		}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.chrome.drive","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
		}
	}

}
