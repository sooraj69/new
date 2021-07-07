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

public class TestNGrealtime {
  @Test
  public void createuser() {
	  Reporter.log("the user is created",true);
	  
  }
  @BeforeMethod
  public void openbrowser() {
	  Reporter.log("open the browser",true);
  }

  @AfterMethod
  public void closebrowser() {
	  Reporter.log("close the browser",true);
  }

  @Test
  public void addEmp1() {
	  Reporter.log("add the emp",true);
  }

  }
