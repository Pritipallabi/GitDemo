package SWDDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingLinks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		//driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
	}

}

























