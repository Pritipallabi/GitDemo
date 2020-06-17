package OOPsDemos;

class clsOverload
{
	public int Add(int i, int j)
	{
		return(i+j);
	}
	
	public int Add(int i,int j,int k)
	{
		return(i+j+k);
	}
	
	public String Add(String s1,String s2)
	{
		return(s1.concat(s2));
	}
}
public class usingMethodOverloading {

	public static void main(String[] args) 
	{
		clsOverload obj=new clsOverload();
		System.out.println("The sum of 10,20 and 30 is : " + obj.Add(10, 20,30));
		System.out.println("The concatenation of 'Java' and 'Programs' is : " + obj.Add("Java", "Programs"));
		System.out.println("The addition of 100 and 200 is : " + obj.Add(100, 200));
	}

}
















