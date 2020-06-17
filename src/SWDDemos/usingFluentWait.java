package SWDDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class usingFluentWait 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		
		System.out.print("Before Date Selection, Lable text = ");
		String msg1=driver.findElement(By.xpath(
				"//*[@id='ctl00_ContentPlaceholder1_Label1']")).getText();
		
		System.out.println(msg1);
		
		driver.findElement(By.linkText("25")).click();
		
		FluentWait w=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5)) 
				.ignoring(NoSuchElementException.class);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		
		System.out.print("After Date SEelction, Lable text = ");
		String msg2=driver.findElement(By.xpath(
				"//*[@id='ctl00_ContentPlaceholder1_Label1']")).getText();
		
		System.out.println(msg2);
	}

}


















