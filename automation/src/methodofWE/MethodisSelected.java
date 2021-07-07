package methodofWE;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodisSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/sooraj/Desktop/wcsm5html/radiobutton.html");
	Thread.sleep(2000);
	WebElement tag = driver.findElement(By.id("a1"));
String tagName = tag.getTagName();
	System.out.println(tagName);
	}

}
