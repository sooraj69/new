package locatorXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ignorelink'] and text()=' GEARS ']")).click();
	}

}
