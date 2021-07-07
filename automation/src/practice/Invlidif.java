package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invlidif {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://desktop-qu5mob9/login.do");
		Thread.sleep(3000);

		Prac Pr = new Prac();
		int rc = Pr.getrowCount("./data/Testdata.xlsx","invalid");	

		for(int i=0;i<=rc;i++)
		{
			String user = Pr.readExcel("./data/Testdata.xlsx", "invalid",i,1);
			WebElement un = driver.findElement(By.name("username"));
			un.clear();
			un.sendKeys(user);
			Thread.sleep(2000);
			String pass = Pr.readExcel("./data/Testdata.xlsx","invalid",i,1);
			WebElement pwd = driver.findElement(By.name("pwd"));
			pwd.clear();
			pwd.sendKeys(pass);
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
		}

	}

}



