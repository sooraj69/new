package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Laptop");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Core i5']/preceding-sibling::div")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']/preceding-sibling::div")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF' ]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='DELL' ]/preceding-sibling::div[@class='_24_Dny']")).click();
		//Thread.sleep(2000);
		String PriceOf1stSuggestion = driver.findElement(By.xpath("//div[@class='_4rR01T' ]/ancestor::div[@class='col col-7-12']/following-sibling::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println("the price of the 1st Suggestion is "+PriceOf1stSuggestion);
	}

}
