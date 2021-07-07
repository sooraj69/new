package assertionTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTimeTesting {
	@Test
	public void testActi() {
		
		Reporter.log("launch the browser",true);
		Reporter.log("open the webpage",true);
		Reporter.log("verify page title",true);
		//Assert.
		Reporter.log("if username is enabled enter the username",true);
		Reporter.log("if password is enaled enter the password",true);
		Reporter.log("click on login if it is enable",true);
		Reporter.log("create user",true);
		Reporter.log("logot",true);
	}

}
