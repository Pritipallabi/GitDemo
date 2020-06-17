package SWDDemos;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closingPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		
		String mainWindow=driver.getWindowHandle();
		String title=driver.getTitle();
		
		Set<String> winIds=driver.getWindowHandles();
		for(String id : winIds)
		{
			driver.switchTo().window(id);
			if(!driver.getTitle().equals(title))
			{
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
	}

}




















