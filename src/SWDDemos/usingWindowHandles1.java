package SWDDemos;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingWindowHandles1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		
		//getting currently focused window information
//		String winID=driver.getWindowHandle();
//		String title=driver.getTitle();
//		System.out.println(winID + "==>" + title);
		
		//getting all windows information
		
		Set<String> winIds=driver.getWindowHandles();
		System.out.println("no of windows opened : " + winIds.size());
		
		for(String id : winIds)
		{
			driver.switchTo().window(id);
			System.out.println(id + "==>" + driver.getTitle());
		}
		
	}

}
































