package OOPsDemos;
abstract class A1
{
	public abstract void M1();
	public void M2()
	{
		System.out.println("M2 method from A1 class.");
	}
}
class A2 extends A1
{
	@Override
	public void M1()
	{
		System.out.println("Overrided M1 method from A2 class..");
	}
}

public class usingAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj=new A2();
		obj.M1();
		obj.M2();
	}

}
