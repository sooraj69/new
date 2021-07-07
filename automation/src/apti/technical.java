package apti;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class technical {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		WebElement target = driver.findElement(By.xpath("//span[.='Electronics']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//div[@class='_1fwVde']/a[.='Samsung']")).click();
		//driver.findElement(By.xpath("a//[.='Samsung']")).click();
		
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy M12 (Black, 128 GB)']")).click();
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();
		
		for(String se : handles)
		{
			if(!se.equals(parent))
				driver.switchTo().window(se);
		}
Thread.sleep(2000);

driver.findElement(By.xpath("(//(div[@class='_2C41yO'])[3]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[.=64 GB']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//(button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[.='Remove']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='td-FUv WDiNrH']")).click();

	}
}
	