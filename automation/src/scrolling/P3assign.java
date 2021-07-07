package scrolling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P3assign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.bluestone.com/");//google
		Thread.sleep(3000);
		driver.findElements(By.xpath("//span[@class='prcs-d']"));
		List<WebElement> ls = driver.findElements(By.xpath("//li[@class='menuparent repb']"));
		int a=ls.size();
		List<WebElement> text = driver.findElements(By.xpath("//ul[@class='two-col']"));
		{
			for(int i=0;i<=a;i++)
			{
				Thread.sleep(3000);
				
				for (WebElement web: text)
				{
					String data = web.getText();
					
					System.out.println(data);
					Thread.sleep(3000);
				}
					
					Actions act = new Actions(driver);
				act.moveToElement(ls.get(i)).perform();
				
			}
			
				
		
		}
	}
}
			
			

			
			
			
			
			

	

