package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptops");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='HP']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[.='Intel Core i5']/preceding-sibling::div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Windows 10']/preceding-sibling::div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='8 GB']/preceding-sibling::div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/descendant));
	}

}
