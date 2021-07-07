package practice;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webEl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		//WebElement searchBox = driver.findElement(By.name("q"));
		//searchBox.sendKeys("java");
		WebElement button = driver.findElement(By.xpath("//button[.='Log In']"));
		Thread.sleep(4000);
		Rectangle rect = button.getRect();
	}
	

}
