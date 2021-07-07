package excelFileHandling;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class rowcount {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://desktop-qu5mob9/login.do");
		Thread.sleep(2000);
		
		Reusable rs = new Reusable();
		int rc = rs.getRowCount("./data/Testdata.xlsx", "invalid");
		System.out.println("the row count is "+ rc);
		
	}

}
