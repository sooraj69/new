package keywordDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activalid {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-qu5mob9/login.do");
		Thread.sleep(3000);
		

		Flib fli = new Flib();
		String url = fli.readProperty("./data/config.properties", "url");
		driver.get(url);
		
		String username = fli.readProperty("./data/config.properties","un");
		String pass = fli.readProperty("./data/config.properties","pwd");
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
		
		
		
		
			
	}

}
