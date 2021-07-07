package excelFileHandling;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-qu5mob9/login.do");
		Thread.sleep(3000);
		
		Reusable reusable = new Reusable();
		int rc = reusable.getRowCount("./data/Testdata.xlsx", "invalid");

		for(int i=1;i<=rc;i++)
		{
			reusable.readExcel("./data/Testdata.xlsx", "invalid", i, 0);
			
			
		}
	}

}
