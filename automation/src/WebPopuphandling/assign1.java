package WebPopuphandling;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4500)");//down
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='//div[@class='flex flex-middle p-relative homeCalender']/descendant::button[contains(@class,'neutral')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Day' and .,'18']"));
			
	}
	}


