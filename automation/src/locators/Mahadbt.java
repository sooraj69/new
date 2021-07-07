package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mahadbt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mahadbtmahait.gov.in/Login/Login");
		
		WebElement userNameTextBox = driver.findElement(By.name("UserName"));
		userNameTextBox.sendKeys("suraj123@gmail.com");
		Thread.sleep(3000);
		WebElement passwordTextBox = driver.findElement(By.name("Password"));
		passwordTextBox.sendKeys("suraj123");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.name("Command"));
		loginButton.click();
		
	

	}

}
