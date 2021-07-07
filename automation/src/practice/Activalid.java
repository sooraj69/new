package practice;

import java.io.IOException;

import org.openqa.selenium.By;

public class Activalid extends baseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		baseTest bt = new baseTest();
		bt.setUp();
		
		flib flib = new flib();
		String username = flib.readProp(PROP_PATH, "un");
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
				
		String pwd = flib.readProp(PROP_PATH, "pwd");
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		bt.tearDown();
		
	
	}

}
