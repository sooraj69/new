package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("srjmore123@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("1234567");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[.='Log In']")).click();
	
	


	}

}
