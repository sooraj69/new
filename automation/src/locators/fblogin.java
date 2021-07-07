package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver	=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/#loggedout");
			WebElement userNameTextBox = driver.findElement(By.id("userid"));
			userNameTextBox.sendKeys("suraj123@gmail.com");
			Thread.sleep(3000);
			WebElement passwordTextBox = driver.findElement(By.id("password"));
			passwordTextBox.sendKeys("suraj123",Keys.ENTER);
			
	}

}
