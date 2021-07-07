package Synchro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitActi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-qu5mob9/login.do");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println("pass1");
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		System.out.println("pass2");
	}

}
