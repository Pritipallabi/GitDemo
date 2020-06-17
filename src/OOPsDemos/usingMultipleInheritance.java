package OOPsDemos;

class clsFunctions extends clsMaths1 implements IStrFunctions
{
	@Override
	public String strReverse(String str) 
	{
		String strRev="";
		for(int i=str.length()-1;i>=0;i--)			
		{
			strRev=strRev+str.charAt(i);
		}
		return strRev;
	}
}

public class usingMultipleInheritance {

	public static void main(String[] args) 
	{
		clsFunctions obj=new clsFunctions();
		System.out.println("The reverse of 'Java' is : " + obj.strReverse("Java"));
		System.out.println("The substraction of 400 and 120 is : " + obj.Substract(400, 120));
		System.out.println("The sum of 10 and 20 is : "+ obj.Add(10, 20));
	}

}





















