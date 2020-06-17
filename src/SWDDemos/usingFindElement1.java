package SWDDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingFindElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		
		WebElement txt=driver.findElement(By.id("gh-ac"));
		txt.sendKeys("Sony");
		
//		WebElement btn=driver.findElement(By.id("gh-btn"));
//		btn.click();
		
		driver.findElement(By.id("gh-btn")).click();
	}

}



















