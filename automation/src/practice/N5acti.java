package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class N5acti {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("http://desktop-qu5mob9/login.do");
	
		N4 n = new N4();
			String username = n.readExcel("./data/Testdata.xlsx", "valid", 1, 0);
			String pass = n.readExcel("./data/Testdata.xlsx", "valid", 1,1);
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.xpath("//a[.='Login']")).click();
			
			
	}

}
