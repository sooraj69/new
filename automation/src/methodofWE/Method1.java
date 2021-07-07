package methodofWE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	WebElement	searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("java");
 String	value=searchBox.getAttribute("class");
		System.out.println(value);
			


	}

}
