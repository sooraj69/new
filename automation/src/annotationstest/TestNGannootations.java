package annotationstest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGannootations {
  @Test
  public void f() {
	  Reporter.log("testcase1",true);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("beforemethod",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("aftermethod",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("beforeclass",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("afterclass",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforeTest",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("afterTest",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforeSuite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("aftersuite",true);
  }
 
  @Test
  public void g()
  {
	  Reporter.log("testcase2",true);
  }
}
