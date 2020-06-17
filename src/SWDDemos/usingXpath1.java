package SWDDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingXpath1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
	}

}
