package WebPopuphandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/sooraj/Desktop/wcsm5html/alert.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();// will behave in same way
		
	}

}
