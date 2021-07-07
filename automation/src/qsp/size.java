package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class size {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		driver.get("https://www.google.com");
WebElement search = driver.findElement(By.name("btnK"));
			String cssValue = search.getCssValue("fontfamily");
			System.out.println(cssValue);
	}
	

}
