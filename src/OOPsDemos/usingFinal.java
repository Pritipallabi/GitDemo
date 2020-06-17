package OOPsDemos;

class F1
{
	public int i=10;
	public void M1()
	{
		System.out.println("M1 method from F1 class.");
	}
}
class F2 extends F1
{
	@Override
	public void M1()
	{
		System.out.println("Overrided M1 method from F2 class..");
	}
}
class F3 extends F2
{
	@Override
	public void M1()
	{
		System.out.println("Overrided M1 method from F3 class...");
	}
}
public class usingFinal {

	public static void main(String[] args)
	{
		F3 obj=new F3();
		System.out.println("Initially, i = " + obj.i);
		obj.i=100;
		System.out.println("After modification, i = " + obj.i);
		obj.M1();
	}

}



















