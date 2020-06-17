package SWDDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingFrames2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Google%20Drive/Selenium%20ClassRoom%20Training/Selenium18/Programs/frames/main.htm");
		
		driver.switchTo().frame("f1");
		driver.findElement(By.id("txtUid")).sendKeys("Admin");
		driver.findElement(By.id("txtPwd")).sendKeys("abc");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("btnSignIn")).click();
		System.out.println("Logged In Successfully..");
		

	}

}
