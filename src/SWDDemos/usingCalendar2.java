package SWDDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingCalendar2 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Month to select : ");
		String month=sc.next();
		month=month.substring(0,3);	//to get first 3 chars 
		
		System.out.print("Enter Day to Select : ");
		String day=sc.next();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://redbus.in");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
		
		//month selection
		while(true)
		{
			String calMonth=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
			calMonth=calMonth.substring(0,3);
			
			if(calMonth.equalsIgnoreCase(month))
				break;
			else
				driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		}
		
		//day selection
		List<WebElement> rows=driver.findElements(By.xpath(
				"//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		
		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath(
					"//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td"));
			
			for(int j=1;j<=cols.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath(
					"//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td[" + j +"]"));
				
				if(cell.getText().equalsIgnoreCase(day))
				{
					cell.click();
					break;
				}
			}
			
		}
	}

}







































