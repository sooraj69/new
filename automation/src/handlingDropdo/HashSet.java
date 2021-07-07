package handlingDropdo;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/sooraj/Desktop/wcsm5html/drop1.html");//launch the web application
	    Thread.sleep(4000);
		WebElement dropdown = driver.findElement(By.id("menu"));
		
		Select sel = new Select(dropdown);
		
		List<WebElement> ops = sel.getOptions();
		
	TreeSet<String> s	=new TreeSet<String>();
	
	for(int i=0; i<ops.size();i++)
	{
		
	String Texttoinsert	=ops.get(i).getText();
	s.add(Texttoinsert);
	}
		
	for(String text:s)
	{
		System.out.println(text);
		
	
	}

	}

}
