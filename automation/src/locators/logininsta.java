package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logininsta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		//Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Log In']")));
		driver.findElement(By.xpath("//div[.='Log In']")).click();
		
		
	}

}
