package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(name="username")private WebElement usn;
	@FindBy(name="pwd")private WebElement psw;
	@FindBy(name="loginButton")private WebElement loginBtn;
	
	
	
	
	
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void sendUsername(String username)
	{
		usn.sendKeys(username);
	}

	public void sendPassword(String pass)
	{
		psw.sendKeys(pass);
		
	}
	public void clicklogin()
	{
		loginBtn.click();
		
	}
	public void validlogin(String username, String password)
	{
		usn.sendKeys(username);
		psw.sendKeys(password);
		loginBtn.click();
	}
	
}

