package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptops");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Operating System']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div")).click();
		Thread.sleep(3000);
		String firstSuggestion = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='col col-7-12']/following-sibling::div[@class='col col-5-12 nlI3QM']/descendant::div[.='₹65,990']")).getText();
		System.out.println("price of "+firstSuggestion);
		
		
		
		
		
	}

}
