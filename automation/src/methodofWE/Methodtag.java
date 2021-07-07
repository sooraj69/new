package methodofWE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodtag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	WebElement	searchBox = driver.findElement(By.name("q"));
String	tag=searchBox.getTagName();
System.out.println(tag);
	}

}
