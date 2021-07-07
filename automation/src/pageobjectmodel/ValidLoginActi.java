package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ValidLoginActi extends Basetest {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {

		Basetest bt = new Basetest();
		Flib fli = new Flib();

		bt.setUp();
		Loginpage login = new Loginpage(driver);
		//PageFactory.initElements(driver, login);

		Thread.sleep(3000);
		login.sendUsername(fli.readPropertyData(PROP_PATH, "un"));
		login.sendPassword(fli.readPropertyData(PROP_PATH, "pwd"));
		login.clicklogin();
		//login.validlogin("admin", "manager");
		//login.clicklogin();

	}
}


