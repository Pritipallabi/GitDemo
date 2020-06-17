package SWDDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class usingDriverMethods {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.ebay.com");
		driver.navigate().to("http://amazon.in");
		driver.navigate().back();
	}

}
