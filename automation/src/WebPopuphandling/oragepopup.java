package WebPopuphandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class oragepopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement userNameTextBox = driver.findElement(By.name("txtUsername"));
		userNameTextBox.sendKeys("Admin");
		
		WebElement passwordTextBox = driver.findElement(By.name("txtPassword"));
		passwordTextBox.sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
	
		
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		
		Thread.sleep(2000);

		WebElement firstNameTextBox = driver.findElement(By.name("firstName"));
		firstNameTextBox.sendKeys("suraj");
		
		WebElement lastNameTextBox = driver.findElement(By.name("lastName"));
		lastNameTextBox.sendKeys("more");
		
		 WebElement target = driver.findElement(By.id("photofile"));
		
		 new Actions(driver).doubleClick(target).perform();
		Thread.sleep(3000);
		
		

		
	}

}
