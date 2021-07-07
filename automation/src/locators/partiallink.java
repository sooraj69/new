package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sooraj/Desktop/wcsm5html/link.html");
		Thread.sleep(1000);
driver.findElement(By.partialLinkText("instagram")).click();
		
	}

}
