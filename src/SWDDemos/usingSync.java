package SWDDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class usingSync 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("selenium.venkatbj@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
		
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[@id='password']/div[1]/div/div[1]/input")));
		
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("xyz");
	}
}



















