package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class outlook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1620828814&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d76d8d3e5-1690-2e41-d738-ed414ee64787&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		Thread.sleep(3000);
		WebElement userNameTextBox = driver.findElement(By.name("loginfmt"));
		userNameTextBox.sendKeys("srj123@gmail.com",Keys.ENTER);
		Thread.sleep(3000);
		WebElement passwordTextBox = driver.findElement(By.name("passwd"));
		passwordTextBox.sendKeys("suraj123",Keys.ENTER);



	}

}
