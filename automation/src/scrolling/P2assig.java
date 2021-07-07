package scrolling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2assig {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.urbanladder.com/");//google
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> ls = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));//("//span[@class='topnav_itemname']");
		int a = ls.size();
		for(int i=1; i<=a;i++)
		{
			//driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Actions act = new Actions(driver);
		act.moveToElement(ls.get(i)).perform();//mouse Hover action performed on target Electronics
		Thread.sleep(1000);
		
		}


	}

}
