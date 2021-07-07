package keywordDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1{
static WebDriver driver;


	public void open() throws IOException
	{
		  Flib fis = new Flib();
		  String brows = fis.readProperty("./data/config.properties", "browser");
		  String url = fis.readProperty("./data/config.properties","url");
		  
		  if(brows.equalsIgnoreCase("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(url);
				
				
		  }
		  else if(brows.equalsIgnoreCase("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				 driver=new FirefoxDriver();
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				 driver.get(url);
				
		  }
		  else 
		  {
			  System.out.println("invalid input");
	}
	}
	
	
	
	
	
	
	
	
}
