package JavaSamples;

import java.util.Scanner;

public class usingStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
//		
//			//if..else Demo
//		System.out.println("Enter Salary : ");
//		int sal=sc.nextInt();
//		int aSal=0;
//		
//		if(sal>=20000)
//		{
//			aSal=12*sal;
//			System.out.println("Annual Salary : " + aSal);
//		}
//		else
//			System.out.println("Salary must be more than 20000 to get annual salary...");
	
			//nested if..else demo
		
//		System.out.println("Enter Salary : ");
//		double sal=sc.nextDouble();
//		int comm=0;
//		double gSal=0;
//		
//		if(sal<20000)
//			comm=10;
//		else if(sal>=20000 && sal<=40000)
//			comm=20;
//		else 
//			comm=30;
//		
//		gSal=sal+(comm*sal)/100;
//		
//		System.out.println("Gross Salary : " + gSal);
		
			//while demo
		
//		int i=1,s=0;
//		while(i<=10) 
//		{
//			s=s+i;
//			i=i+1;
//		}
//		System.out.println("The sum of first 10 numbers is : " + s);
		
			//do..while Demo
		
//		String uname,pwd;
//		do
//		{
//			System.out.print("Enter Username : ");
//			uname=sc.next();
//			System.out.print("Enter Password : ");
//			pwd=sc.next();
//		}while(!uname.equals("java") || !pwd.equals("programs"));
			
			//for Demo
		//for(int i=1;i<=20;i++)
		//for(int i=20;i>=1;i--)
//		for(int i=1;i<=20;i+=2)
//		{
//			System.out.println(i);
//		}
		
			//continue demo
		
//		for(int i=1;i<=20;i++)
//		{
//			if(i%2!=0)
//			{
//				continue;
//			}
//			
//			System.out.println(i);
//		}
		
			//break Demo
		
//		String uname,pwd;
//		int count=0;
//		do
//		{
//			if(count==3)
//			{
//				System.out.println("Your 3 choices are over.Exiting the application...");
//				break;
//			}
//			if(count>0)
//				System.out.println("Invalid login details.Try Again...");
//			
//			System.out.print("Enter Username : ");
//			uname=sc.next();
//			System.out.print("Enter Password : ");
//			pwd=sc.next();
//			count=count+1;
//		}while(!uname.equals("java") || !pwd.equals("programs"));
		
			//switch..case demo
		
		System.out.print("Enter Number1 : ");
		int n1=sc.nextInt();
		
		System.out.print("Enter Number2 : ");
		int n2=sc.nextInt();
		
		System.out.println("Enter choice of operation(+/-/*) : ");
		char ch=sc.next().charAt(0);
		
		int res=0;
		boolean isValid=true;
		
		switch(ch)
		{
			case '+':
				res=n1+n2;
				break;
			
			case '-':
				res=n1-n2;
				break;
			
			case '*':
				res=n1*n2;
				break;
		
			default:
				isValid=false;
				break;
		}
		
		if(isValid==true)
			System.out.println("The arithmetic operation " + ch + " on " + n1 + 
					" with " + n2 + " is : " + res);
		else
			System.out.println("Invalid choice entered....");
	}

}































