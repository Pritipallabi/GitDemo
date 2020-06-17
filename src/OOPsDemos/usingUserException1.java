package OOPsDemos;

import java.util.Scanner;

public class usingUserException1 {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Salary : ");
			int sal=sc.nextInt();
			int aSal=0;
			
			if(sal>=20000)
			{
				aSal=12*sal;
				System.out.println("Annual Salary : " + aSal);
			}
			else
				throw new myException();
		}
		catch(myException ex)
		{
			System.out.println(ex);
		}
		
	}

}











