package SWDDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingCloseAndQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//driver.close();
		driver.quit();
	}

}
