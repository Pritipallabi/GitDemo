package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependencyTestDemo extends driverFactory
{
  @Test(dependsOnMethods="checkTitle")
  public void Search() 
  {
	  driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
	  
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).build().perform();
  }
  
  @Test
  public void checkTitle()
  {
	  String title=driver.getTitle();
	  //Assert.assertEquals(title, "Google1");
	  Assert.assertEquals(title, "Google");
  }
}

















