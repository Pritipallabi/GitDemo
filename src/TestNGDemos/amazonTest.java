package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class amazonTest
{
  @Test
  public void aSearch() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://amazon.in");
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG");
	  driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
	  
	  Reporter.log("Amazon product search is sucessful...",true);
	  
  }
}

















