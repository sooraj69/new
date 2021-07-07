package methodofWE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
	WebElement	text=driver.findElement(By.partialLinkText("documentation"));
	String	sele=text.getText();
	System.out.println(sele);
Boolean	dis=text.isDisplayed();
System.out.println(dis);

	}

}
