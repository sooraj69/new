package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

		public class LoginInstagramClassNameLocator {
			
			public void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com");
				
				
				WebElement userNameTextBox = driver.findElement(By.name("username"));
				userNameTextBox.sendKeys("suraj123@gmail.com");
				
				WebElement passwordTextBox = driver.findElement(By.name("password"));
				passwordTextBox.sendKeys("suraj123");
				
				WebElement loginButton = driver.findElement(By.className("                     Igw0E     IwRSH      eGOV         4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    "));
				loginButton.click();
				
			}

		}
		
	}


