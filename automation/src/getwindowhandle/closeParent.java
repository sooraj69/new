package getwindowhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeParent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		String parentTitle = driver.getTitle();
		Set<String> child = driver.getWindowHandles();
		
		
		for(String wh: child)
		{
			String title = driver.switchTo().window(wh).getTitle();
			if(!title.equals(parentTitle))
			{
			driver.close();
		}
			}
	}

}
