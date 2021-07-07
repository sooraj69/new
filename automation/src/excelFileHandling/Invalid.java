package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-qu5mob9/login.do");
		Thread.sleep(3000);
					
		Reusable reusable = new Reusable();			
		int rc = reusable.getRowCount("./data/Testdata.xlsx","invalid");
	
	for(int i=0; i<=rc;i++)
	{
		String user = reusable.readExcel("./data/Testdata.xlsx", "invalid", i, 0);
			WebElement username = driver.findElement(By.name("username"));
			username.clear();
			username.sendKeys(user);
			
			String pass = reusable.readExcel("./data/Testdata.xlsx","invalid",i ,1 );
			WebElement password = driver.findElement(By.name("pwd"));
			password.sendKeys(pass);
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
	}
	
	}
	

}
