package handlingDropdo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) {
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
		List <WebElement> suggestions = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
	
		for(WebElement we : suggestions)
		{
		String laptopsugg= we.getText();
		System.out.println(laptopsugg);
	
		}
	);
	}
	
	

}
