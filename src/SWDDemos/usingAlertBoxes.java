package SWDDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingAlertBoxes 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		
		driver.switchTo().frame("result1");
		
		driver.findElement(By.xpath("/html/body/input")).click();
		
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}

}















