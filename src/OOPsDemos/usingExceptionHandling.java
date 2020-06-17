package OOPsDemos;

import java.util.Scanner;

public class usingExceptionHandling {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Number1 : ");
			int n1=sc.nextInt();
			System.out.print("Enter Number2 : ");
			int n2=sc.nextInt();
			
			int result=n1/n2;
			
			System.out.println("The division of " + n1 + " with " + n2 + " is : " + result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("You can't divide a number with zero...");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}















