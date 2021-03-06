package SWDDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingWebTable2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Company to be searched : ");
		String comp=sc.nextLine();
		
		String cntry=null;
		boolean isExist=false;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows=driver.findElements(By.xpath(
				"//*[@id='customers']/tbody/tr"));

		for(int i=2;i<=rows.size();i++)
		{
			//fetching companyName column value(1st column)
			WebElement tComp=driver.findElement(By.xpath(
					"//*[@id='customers']/tbody/tr[" + i + "]/td[1]"));
			
			//comparing given companyName matches with existing
			if(tComp.getText().equalsIgnoreCase(comp))
			{
				isExist=true;
				
				//fetching country data of the company(3rd column)
				cntry=driver.findElement(By.xpath(
						"//*[@id='customers']/tbody/tr[" + i + "]/td[3]")).getText();
				break;
			}
		}
		
		if(isExist==true)
		{
			System.out.println("'" + comp + "' is available in the country : " + cntry);
		}
		else
		{
			System.out.println("'" + comp + "' is NOT available in the webtable...");
		}
		
		driver.close();
	}

}














