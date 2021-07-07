package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest implements iAuto{
	static WebDriver driver;
	public void setUp() throws IOException
	{
		flib flib = new flib();
		String baseUrl = flib.readProp(PROP_PATH, "url");
		String browserVal = flib.readProp(PROP_PATH, "browser");
	
		if(browserVal.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseUrl);
			
		}
		else if(browserVal.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseUrl);
			
		}
		else
		{
			System.out.println("invalid choice");
		}
	
	
	}
	public void tearDown() {
		driver.close();
		
	}
}
