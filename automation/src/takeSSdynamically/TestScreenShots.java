package takeSSdynamically;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListners.class)
public class TestScreenShots extends Base {
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test
	public void verifyTitle()
	{
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle,"actiTIME - Login");
	}
	
	@Test
	public void verifyTitle2()
	{
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle,"actiTIME - Logi");
	}
	
	@Test
	public void verifyTitle3()
	{
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle,"actiTIME - Logi");
	}
	
	@Test
	public void verifyTitle4()
	{
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle,"actiTIME - Logi");
	}
	
	@Test
	public void verifyTitle5()
	{
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle,"actiTIME - Logi");
	}

}