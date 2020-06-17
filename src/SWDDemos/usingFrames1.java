package SWDDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingFrames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		
		driver.switchTo().frame("result1");
		driver.findElement(By.xpath("/html/body/input")).click();
	}

}
