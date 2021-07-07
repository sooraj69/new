package testNG;

import org.testng.annotations.Test;

public class Priority {
  @Test (priority=0)
  public void a() 
  {
  System.out.println("hi i am from x");
  }
  
  @Test (priority=1)
  public void b() 
  {
  System.out.println("hi i am from y");
  }
  
  @Test 
  public void C() 
  {
  System.out.println("hi i am from 1");
  }
  
}
