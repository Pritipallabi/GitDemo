package OOPsDemos;

class clsMaths
{
	public void Swap(int i,int j)
	{
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("After swaping, FirstNumber = " + i + ", SecondNumber : " + j);
	}
	
	public int Add(int i, int j)
	{
		return(i+j);
	}
}
public class usingMethods {

	public static void main(String[] args) 
	{
		clsMaths obj=new clsMaths();
		int x=100,y=200;
		System.out.println("Initially, FirstNumber = " + x + ", SecondNumber = " + y);
		obj.Swap(x, y);
		
		int result=obj.Add(10, 20);
		System.out.println("The sum of 10 and 20 is : " + result);
		System.out.println("The square of " + result + " is : " + result*result);
	}

}























