package getwindowhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) 	throws InterruptedException{
	
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		String handle = driver.getWindowHandle();
		Set<String> allhandle = driver.getWindowHandles();
	
		System.out.println("the window handle is :"+ handle);
		System.out.println("the total windows handles are :" +allhandle.size());

		for (String wh:allhandle)
	{
		driver.switchTo().window(wh);
		driver.close();
		
	}
	//for(String we:allhandle)
	//{
	//System.out.println(we);
	//}
		
	}
		
	}


