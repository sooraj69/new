package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/sooraj/Desktop/wcsm5html/drag&drop.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.id("draggable-2"));
		WebElement dest = driver.findElement(By.id("droppable-2"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//p[.='Dropped!']")).getText();
		
	
		if(text.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("the element is dragged and drop");
		}
		
	}

}
