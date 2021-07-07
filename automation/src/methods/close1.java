package methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class close1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.naukri.com");
		driver.close();
		driver.quit();
	}

}