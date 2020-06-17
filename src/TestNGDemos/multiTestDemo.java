package TestNGDemos;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class multiTestDemo {
  @Test(priority=1)
  public void Login1() 
  {
	  Reporter.log("Login1 Test Script...",true);
  }
  @Test(priority=4,enabled=false)
  public void Login2() 
  {
	  Reporter.log("Login2 Test Script...",true);
  }
  @Test(priority=2)
  public void Trans1() 
  {
	  Reporter.log("Trans1 Test Script...",true);
  }
  @Test(priority=3)
  public void Trans2() 
  {
	  Reporter.log("Trans2 Test Script...",true);
  }
}
