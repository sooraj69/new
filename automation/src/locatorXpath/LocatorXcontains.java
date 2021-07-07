package locatorXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXcontains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'_2hvTZ')]")).sendKeys("asb@gmail.com");
		
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//input[contains(@class,'pexuQ')]")).sendKeys("askd");
		
		
		
		
		
	}

}
