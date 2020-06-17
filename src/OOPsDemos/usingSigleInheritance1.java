package OOPsDemos;

import java.util.Scanner;

public class usingSigleInheritance1 {

	public static void main(String[] args) 
	{
		clsMaths2 obj=new clsMaths2();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number1 : ");
		int n1=sc.nextInt();
		System.out.print("Enter Number2 : ");
		int n2=sc.nextInt();
		System.out.println("The sum of " + n1 + " and " + n2 + " is : " + obj.Add(n1,n2));
		System.out.println("The substraction of " + n1 + " and " + n2 + " is : "+ obj.Substract(n1,n2));
		System.out.println("The mulitiplication of " + n1 + " and " + n2 + " is : " + obj.Multiply(n1,n2));
		System.out.println("The division of " + n1 + " with " + n2 + " is : "+ obj.Divide(n1, n2));
	}

}

















