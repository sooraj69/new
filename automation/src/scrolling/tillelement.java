package scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tillelement {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
			ChromeDriver driver=new ChromeDriver();// launch the chrome browser
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.ajio.com/");//google
		WebElement target = driver.findElementByXPath("//img[contains(@src,'onlinestores') and contains(@src,'sectionheader')]");
		Point loc = target.getLocation();
		int xaxis = loc.getX();
			int yaxis = loc.getY();
			
			System.out.println("xaxis= " +xaxis);
			System.out.println("yaxis= " +yaxis);
		JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");

	}

}
