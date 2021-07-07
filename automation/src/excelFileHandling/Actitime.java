package excelFileHandling;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-qu5mob9/login.do");
		Thread.sleep(3000);
		
		Reusable reusable = new Reusable();
		{
			String username = reusable.readExcel("./data/Testdata.xlsx", "valid", 1, 0);
			String password = reusable.readExcel("./data/Testdata.xlsx", "valid", 1,1);
		
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.xpath("//a[.='Login']")).click();
			
			//for entering data in status cell i.e test case is pass
			WebDriverWait wb = new WebDriverWait(driver,30);
			wb.until(ExpectedConditions.titleContains("Enter"));
			
			reusable.writeExcel("./data/Testdata.xlsx", "valid", 1, 2, "pass");
		}
		
	}

}
