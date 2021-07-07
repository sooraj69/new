package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageSource {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sooraj/Desktop/wcsm5html/checkbox.html");
	
	String pageSource=driver.getPageSource() ;
	System.out.println(pageSource);
	}

}
