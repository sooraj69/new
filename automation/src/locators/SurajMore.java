package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SurajMore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		WebElement electronics_menuname = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(electronics_menuname).build().perform();
        WebElement mobile_menu_button = driver.findElement(By.xpath("//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']//a[contains(text(),'Mobiles')]"));
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(mobile_menu_button)).click();
        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(By.xpath("//*[@id='menu-links']/a/div[3]"));
        actions.moveToElement(menu);

        WebElement subMenu = driver.findElement(By.xpath("//*[@id='menu-links']/ul/li[2]/a"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        
        driver.findElement(By.xpath("//a[.='realme Narzo 30A (Laser Black, 64 GB)']")).click();
        
       Thread.sleep(4000);
       driver.findElement(By.xpath("//li[@id='swatch-1-color']")).click();
        
	}

}
