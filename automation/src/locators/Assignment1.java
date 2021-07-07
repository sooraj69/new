package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("joe tribioni",Keys.ENTER);
		WebElement pizza = driver.findElement(By.className("INPne"));
		pizza.click();
	}

}
