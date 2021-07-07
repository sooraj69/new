package keywordDriven;

import java.io.IOException;

import org.openqa.selenium.By;

public class actimeTimeLogin extends P1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		P1 p = new P1();
		
		p.open();
		Thread.sleep(3000);
		
		Flib fis = new Flib();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		p.open();
		
	}

}
