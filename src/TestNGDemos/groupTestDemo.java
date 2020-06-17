package TestNGDemos;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupTestDemo 
{
	 @Test(groups= {"Login"})
	  public void Login1() 
	  {
		  Reporter.log("Login1 Test Script...",true);
	  }
	  @Test(groups= {"Login"})
	  public void Login2() 
	  {
		  Reporter.log("Login2 Test Script...",true);
	  }
	  @Test(groups= {"Trans"})
	  public void Trans1() 
	  {
		  Reporter.log("Trans1 Test Script...",true);
	  }
	  @Test(groups= {"Trans"})
	  public void Trans2() 
	  {
		  Reporter.log("Trans2 Test Script...",true);
	  }
}
