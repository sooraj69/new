package parallelmethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Methodparallel {
  @Test
  public void method1() 
  {
	  Reporter.log("i am from 1"+Thread.currentThread().getId(),true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("i am from 2"+Thread.currentThread().getId(),true);
  }


}
