package SWDDemos;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshotDemo 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		File fSource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fDest=new File("D:\\Google Drive\\Selenium ClassRoom Training\\Selenium18\\Programs\\errorPic.png");
		
		FileHandler.copy(fSource, fDest);
	}

}



















