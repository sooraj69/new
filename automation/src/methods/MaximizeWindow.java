package methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver	=new ChromeDriver();
	driver.get("https://www.instagram.com");
	Point point = new Point(300,400);
	driver.manage().window().setPosition(point);
	}
	

}
