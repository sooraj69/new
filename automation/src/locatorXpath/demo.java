package locatorXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//i[@class='icon cv-mob-wishlist']")).click();
		//driver.findElement(By.xpath("//a[@class='nav-a  ']")).click();
		//driver.findElement(By.xpath("//a[@class='mobile-menu mobile-navbar visible-xs visible-sm']")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@.,'Amazon Music']")).click();
	}

	}


