package OOPsDemos;

import java.util.Scanner;

public class usingUserException2 {

	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Salary : ");
			double sal=sc.nextDouble();
			int comm=0;
			double gSal=0;
			
			if(sal<20000)
				throw new myException();
			else if(sal>=20000 && sal<=40000)
				comm=10;
			else 
				comm=20;
			
			gSal=sal+(comm*sal)/100;
			
			System.out.println("Gross Salary : " + gSal);
		}
		catch(myException ex)
		{
			System.out.println(ex);
		}
	}

}










