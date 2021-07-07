package combo;




import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin  extends baseTest{

	public static void main(String[] args) throws IOException, InterruptedException {

		baseTest bt = new baseTest();
		bt.setUp();

		flib flib = new flib();
		String username = flib.readPropertyData(PROP_PATH, "un");

		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);

		String password = flib.readPropertyData(PROP_PATH, "pwd");

		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(1000);

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		bt.tearDown();


	}

}