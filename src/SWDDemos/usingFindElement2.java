package SWDDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingFindElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement txt=driver.findElement(By.name("q"));
		txt.sendKeys("Selenium WebDriver");
	}

}
